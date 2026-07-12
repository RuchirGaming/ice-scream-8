package kotlin.reflect.jvm.internal.pcollections;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes8.dex */
final class ConsPStack<E> implements Iterable<E> {
    private static final ConsPStack<Object> EMPTY = new ConsPStack<>();
    final E first;
    final ConsPStack<E> rest;
    private final int size;

    public static <E> ConsPStack<E> empty() {
        return (ConsPStack<E>) EMPTY;
    }

    private ConsPStack() {
        this.size = 0;
        this.first = null;
        this.rest = null;
    }

    private ConsPStack(E e2, ConsPStack<E> consPStack) {
        this.first = e2;
        this.rest = consPStack;
        this.size = consPStack.size + 1;
    }

    public E get(int i2) {
        if (i2 < 0 || i2 > this.size) {
            throw new IndexOutOfBoundsException();
        }
        try {
            return iterator(i2).next();
        } catch (NoSuchElementException unused) {
            throw new IndexOutOfBoundsException("Index: " + i2);
        }
    }

    @Override // java.lang.Iterable
    public Iterator<E> iterator() {
        return iterator(0);
    }

    public int size() {
        return this.size;
    }

    private Iterator<E> iterator(int i2) {
        return new Itr(subList(i2));
    }

    private static class Itr<E> implements Iterator<E> {
        private ConsPStack<E> next;

        public Itr(ConsPStack<E> consPStack) {
            this.next = consPStack;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return ((ConsPStack) this.next).size > 0;
        }

        @Override // java.util.Iterator
        public E next() {
            E e2 = this.next.first;
            this.next = this.next.rest;
            return e2;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public ConsPStack<E> plus(E e2) {
        return new ConsPStack<>(e2, this);
    }

    private ConsPStack<E> minus(Object obj) {
        if (this.size == 0) {
            return this;
        }
        if (this.first.equals(obj)) {
            return this.rest;
        }
        ConsPStack<E> consPStackMinus = this.rest.minus(obj);
        return consPStackMinus == this.rest ? this : new ConsPStack<>(this.first, consPStackMinus);
    }

    public ConsPStack<E> minus(int i2) {
        return minus(get(i2));
    }

    private ConsPStack<E> subList(int i2) {
        if (i2 < 0 || i2 > this.size) {
            throw new IndexOutOfBoundsException();
        }
        return i2 == 0 ? this : this.rest.subList(i2 - 1);
    }
}
