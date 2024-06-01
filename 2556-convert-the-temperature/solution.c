/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
double* convertTemperature(double celsius, int* returnSize) {
    double *arr=(double *)malloc(2*sizeof(double));
    double kelvin=celsius+273.15;
    double f=celsius*1.80+32.00;
    arr[0]=kelvin;
    arr[1]=f;
    *returnSize=2;
    return arr;
}
