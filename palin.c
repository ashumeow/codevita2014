#include <stdio.h>
#include <string.h>

int t, i, j, dp[1005][1005], len;
char sb[1005];

int min(int a, int b) {
	return a < b ? a : b;
}

int main() {
	scanf("%d%*c", &t);
	int tt = 1;
	while (t --) {
		memset(dp, 0, sizeof(dp));
		gets(sb);
		len = strlen(sb);
		for (i = len - 1; i >= 0; i --) {
			for (j = i + 1; j < len; j ++) {
				if (sb[i] == sb[j])
					dp[i][j] = dp[i + 1][j - 1];
				else
					dp[i][j] = min(min(dp[i + 1][j], dp[i][j - 1]), dp[i + 1][j - 1]) + 1;
			}
		}
		printf("Case %d: %d\n", tt ++, dp[0][len - 1]);
	}
	return 0;
}
