#include <bits/stdc++.h>

using namespace std;

// Complete the makeAnagram function below.
int makeAnagram(string a, string b) {
    map <char, int> mymap;
    int a_arr[256] = {0}, b_arr[256] = {0};

    for (int i = 0; i < a.length(); i++) {
        a_arr[a[i]] += 1;
    }

    for (int i = 0; i < b.length(); i++) {
        b_arr[b[i]] += 1;
    }

    int ans = 0;
    for (int i = 0; i < 256; i++) {
        ans += abs(a_arr[i] - b_arr[i]);
    }

    return ans;
}

int main()
{
    ofstream fout(getenv("OUTPUT_PATH"));

    string a;
    getline(cin, a);

    string b;
    getline(cin, b);

    int res = makeAnagram(a, b);

    fout << res << "\n";

    fout.close();

    return 0;
}
