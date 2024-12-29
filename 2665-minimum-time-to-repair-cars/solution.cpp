#define ll long long
class Solution {
public:
    long long repairCars(vector<int>& ranks, int cars) {
        long long left = 0;
        long long right = 1e14;
        while (left < right) {
            ll mid = (left + right) / 2;
            ll count = 0;
            for (int i = 0; i < ranks.size(); i++) {
                count += sqrt(mid / ranks[i]);
            }
            if (count >= cars)
                right = mid;
            else
                left = mid + 1;
        }
        return right;
    }
};
