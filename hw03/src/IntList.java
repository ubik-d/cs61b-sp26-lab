public class IntList {
    int first;
    IntList rest;

    public IntList(int f, IntList r) {
        first = f;
        rest = r;
    }

    /** Return the size of the list using... recursion! */
    public int size() {
        if (rest == null) {
            return 1;
        }
        return 1 + this.rest.size();
    }

    /** Return the size of the list using no recursion! */
    public int iterativeSize() {
        IntList p = this;
        int totalSize = 0;
        while (p != null) {
            totalSize += 1;
            p = p.rest;
        }
        return totalSize;
    }

    /** Returns the ith item of this IntList. */
    public int get(int i) {
        if (i == 0) {
            return first;
        }
        return rest.get(i - 1);
    }

    /**
     * Returns an IntList identical to L, but with
     * each element incremented by x. Modifies the original list.
     * You are not allowed to use "new" in this method.
     */
    public static IntList incrRecursiveDestructive(IntList L, int x) {
        L.first+=x;
        if(L.rest!=null){
            incrRecursiveDestructive(L.rest,x);
        }
        return null;
    }

    /*
     * =================================================================
     * OPTIONAL METHODS
     * =================================================================
     */

    /**
     * Returns the sum of all elements in the IntList.
     */
    public int sum() {
        IntList temp=this;
        int sum=0;
        while(temp.rest!=null){
            sum+=temp.first;
            temp=temp.rest;
        }
        return sum+temp.first;
    }

    /**
     * Destructively adds x to the end of the list.
     */
    public void addLast(int x) {
        IntList last = new IntList(x, null);
        IntList temp=this;
        while(temp.rest!=null){
            temp=temp.rest;
        }
        temp.rest=last;
    }

    /**
     * Destructively adds x to the front of this IntList.
     * This is a bit tricky to implement. The standard way to do this would be
     * to return a new IntList, but for practice, this implementation should
     * be destructive.
     */
    public void addFirst(int x) {
        IntList L = new IntList(x, this);
    }
    public static void main(){
        IntList L = new IntList(5, null);
        L.rest = new IntList(7, null);
        L.rest.rest = new IntList(9, null);

        IntList M = incrRecursiveDestructive(L, 3);
        int sum=L.sum();
        L.addLast(2);
        L.addFirst(45);
    }
}
