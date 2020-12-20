package Pr6;



public class Sort {


    public void sort_ins(Student[] array) {
        for (int left = 0; left < array.length; left++) {

            Student value = array[left];

            int i = left - 1;
            for (; i >= 0; i--) {

                if (value.show_id() < array[i].show_id()) {
                    array[i + 1] = array[i];
                } else {

                    break;
                }
            }

            array[i + 1] = value;
        }


    }

    static void Qsort(Student[] arr, int start, int end) {
        if (start >= end)
            return;
        int i = start, j = end;
        int cur = i - (i - j) / 2;
        while (i < j) {
            while (i < cur && arr[i].compareToBall(arr[cur]) == -1)
                i++;
            while (j > cur && arr[cur].compareToBall(arr[j]) == -1)
                j--;
            if (i < j) {
                Student temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                if (i == cur)
                    cur = j;
                else if (j == cur)
                    cur = i;
            }
        }
        Qsort(arr, start, cur);
        Qsort(arr, cur + 1, end);
    }

    public static void mergeSort(Student[] a, int n) {
        if (n < 2) {
            return;
        }
        int mid = n / 2;
        Student[] l = new Student[mid];
        Student[] r = new Student[n - mid];

        for (int i = 0; i < mid; i++) {
            l[i] = a[i];
        }
        for (int i = mid; i < n; i++) {
            r[i - mid] = a[i];
        }
        mergeSort(l, mid);
        mergeSort(r, n - mid);

        merge(a, l, r, mid, n - mid);
    }

    public static void merge(
            Student[] a, Student[] l, Student[] r, int left, int right) {

        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (l[i].compareTo(r[j]) == -1 || l[i].compareTo(r[j]) == 0) {
                a[k++] = l[i++];
            } else {
                a[k++] = r[j++];
            }
        }
        while (i < left) {
            a[k++] = l[i++];
        }
        while (j < right) {
            a[k++] = r[j++];
        }
    }

}