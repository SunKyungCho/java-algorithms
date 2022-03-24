package leetcode;


/*
  당신은 제품 관리자이며 현재 새 제품을 개발하는 팀을 이끌고 있습니다.
   안타깝게도 최신 버전의 제품은 품질 검사에 실패했습니다.
   각 버전은 이전 버전을 기반으로 개발되기 때문에 나쁜 버전 이후의 모든 버전도 나쁜 것입니다.
   n개의 버전 [1, 2, ..., n]이 있고 첫 번째 잘못된 버전을 찾고자 한다고 가정합니다.

버전이 나쁜지 여부를 반환하는 API bool isBadVersion(version)이 제공됩니다.
첫 번째 잘못된 버전을 찾는 기능을 구현합니다.
API에 대한 호출 수를 최소화해야 합니다.

* */


public class FirstBadVersion278 {

    private final int firstBadVersionNumber;

    public FirstBadVersion278(int firstBadVersionNumber) {
        this.firstBadVersionNumber = firstBadVersionNumber;
    }

    public int firstBadVersion(int n) {
        int start = 1;
        int end = n;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (isBadVersion(mid)) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }

    private boolean isBadVersion(int version) {
        return firstBadVersionNumber <= version;
    }
}
