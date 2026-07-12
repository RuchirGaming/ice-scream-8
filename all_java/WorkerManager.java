package com.ironsource.environment.workerthread;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes5.dex */
public class WorkerManager<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    List<Callable<T>> f15595a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ExecutorService f15596b;

    public interface WorkEndedListener<T> {
        void onWorkCompleted(List<WorkerResult<T>> list, long j2);

        void onWorkFailed(String str);
    }

    public WorkerManager(ExecutorService executorService) {
        this.f15596b = executorService;
    }

    public void addCallable(Callable<T> callable) {
        this.f15595a.add(callable);
    }

    public void startWork(WorkEndedListener<T> workEndedListener, long j2, TimeUnit timeUnit) {
        WorkerResult.Canceled canceled;
        if (this.f15596b.isShutdown()) {
            workEndedListener.onWorkFailed("can not start work, executor has been shut down");
            return;
        }
        if (this.f15595a.isEmpty()) {
            workEndedListener.onWorkFailed("can not start work, callable list is empty");
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList();
        try {
            List<Future<T>> listInvokeAll = this.f15596b.invokeAll(this.f15595a, j2, timeUnit);
            for (int i2 = 0; i2 < listInvokeAll.size(); i2++) {
                Future<T> future = listInvokeAll.get(i2);
                if (!future.isDone() || future.isCancelled()) {
                    canceled = new WorkerResult.Canceled(this.f15595a.get(i2));
                } else {
                    try {
                        arrayList.add(new WorkerResult.Completed(future.get()));
                    } catch (InterruptedException e2) {
                        e = e2;
                        arrayList.add(new WorkerResult.Failed(this.f15595a.get(i2), e));
                    } catch (CancellationException unused) {
                        canceled = new WorkerResult.Canceled(this.f15595a.get(i2));
                        arrayList.add(canceled);
                    } catch (ExecutionException e3) {
                        e = e3;
                        arrayList.add(new WorkerResult.Failed(this.f15595a.get(i2), e));
                    }
                }
                arrayList.add(canceled);
            }
            workEndedListener.onWorkCompleted(arrayList, System.currentTimeMillis() - jCurrentTimeMillis);
            this.f15596b.shutdownNow();
        } catch (Exception e4) {
            e4.printStackTrace();
            workEndedListener.onWorkFailed("failed to invoke callables, error= " + e4.getMessage());
            this.f15596b.shutdownNow();
        }
    }
}
