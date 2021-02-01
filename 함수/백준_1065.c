#include <stdio.h>

int main(void)
{
	int n = 0, answer = 0, i = 0, f = 0, m = 0, l = 0, count = 0, n1 = 0, n2 = 0;

	scanf("%d", &n);

	if (n < 100) {
		answer = n;
	}
	else if (n >= 100) {
		for (i = 100; i <= n; i++) {
			f = i / 100;
			m = (i - (f*100)) / 10;
			l = i % 10;

			n1 = m - f;
			n2 = l - m;

			if (n1 == n2) {
				count++;
			}

		}
		answer = 99 + count;
	}

	printf("%d", answer);

	return 0;
}