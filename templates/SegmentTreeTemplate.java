class SegmentTree {
    int[] tree;
    int n;

    SegmentTree(int size) {
        n = size;
        tree = new int[4 * n];
    }

    void build(int[] arr, int v, int tl, int tr) {
        if (tl == tr) {
            tree[v] = arr[tl];
        } else {
            int tm = (tl + tr) / 2;
            build(arr, 2 * v, tl, tm);
            build(arr, 2 * v + 1, tm + 1, tr);
            tree[v] = Math.max(tree[2*v], tree[2*v+1]);
        }
    }

    int query(int v, int tl, int tr, int l, int r) {
        if (l > r) return Integer.MIN_VALUE;
        if (l == tl && r == tr) return tree[v];
        int tm = (tl + tr) / 2;
        return Math.max(
            query(2*v, tl, tm, l, Math.min(r, tm)),
            query(2*v+1, tm+1, tr, Math.max(l, tm+1), r)
        );
    }

    void update(int v, int tl, int tr, int pos, int val) {
        if (tl == tr) {
            tree[v] = val;
        } else {
            int tm = (tl + tr) / 2;
            if (pos <= tm) update(2*v, tl, tm, pos, val);
            else update(2*v+1, tm+1, tr, pos, val);
            tree[v] = Math.max(tree[2*v], tree[2*v+1]);
        }
    }
}