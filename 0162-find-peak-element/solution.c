int findPeakElement(int* nums, int n) {
    int left = 0, right = n - 1;
    while (left < right) {
        printf("%d %d\n", left, right);
        int mid = (left + right) / 2;
        if (nums[mid] > nums[mid + 1]) {
            right = mid;
        } else {
            left = mid + 1;
        }
    }
    return left;
}
