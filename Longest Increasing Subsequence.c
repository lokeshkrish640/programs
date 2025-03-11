int lengthOfLIS(int* nums, int numsSize) {
    int arr[numsSize];
    int max = 1;
    for (int i = 0; i<numsSize ; i++){
        arr[i] = 1;
    }
    for (int i = 1; i <numsSize ; i++){
        for(int j =0; j < i; j++){
            if(nums[j] < nums[i]){
                arr[i] = arr[i] < arr[j] + 1 ? arr[j] + 1 : arr[i];
                max = max < arr[i] ? arr[i] : max ;
            }
        }
    }
    return max;
}
