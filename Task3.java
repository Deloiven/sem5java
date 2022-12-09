public void heapSort(){
    int arrLength = heapSize;

    for (int i = arrLength-1; i >= 1; i--){
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            --heapSize;
            heapify(0);
    }
}