package com.andreymironov.leetcode;

import org.assertj.core.api.SoftAssertions;
import org.junit.jupiter.api.Test;

class BinarySearchUtilsTest {
    @Test
    void should_search() {
        SoftAssertions.assertSoftly(softly -> {
            softly.assertThat(BinarySearchUtils.search(new int[]{0, 1, 2}, -1)).isEqualTo(-1);
            softly.assertThat(BinarySearchUtils.search(new int[]{0, 1, 2}, 0)).isEqualTo(0);
            softly.assertThat(BinarySearchUtils.search(new int[]{0, 1, 2}, 1)).isEqualTo(1);
            softly.assertThat(BinarySearchUtils.search(new int[]{0, 1, 2}, 2)).isEqualTo(2);
            softly.assertThat(BinarySearchUtils.search(new int[]{0, 1, 2}, 3)).isEqualTo(-1);

            softly.assertThat(BinarySearchUtils.search(new int[]{0, 1, 2, 3}, -1)).isEqualTo(-1);
            softly.assertThat(BinarySearchUtils.search(new int[]{0, 1, 2, 3}, 0)).isEqualTo(0);
            softly.assertThat(BinarySearchUtils.search(new int[]{0, 1, 2, 3}, 1)).isEqualTo(1);
            softly.assertThat(BinarySearchUtils.search(new int[]{0, 1, 2, 3}, 2)).isEqualTo(2);
            softly.assertThat(BinarySearchUtils.search(new int[]{0, 1, 2, 3}, 3)).isEqualTo(3);
            softly.assertThat(BinarySearchUtils.search(new int[]{0, 1, 2, 3}, 4)).isEqualTo(-1);
        });
    }
}