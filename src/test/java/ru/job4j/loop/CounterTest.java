package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CounterTest {
    public void whenSumFrom0To10Then55() {
        int result = Counter.sum(0, 10);
        assertEquals(55, result); // ����� ����� �� 0 �� 10 ������ ���� 55
    }

    @Test
    public void whenSumFrom3To8Then33() {
        int result = Counter.sum(3, 8);
        assertEquals(33, result); // ����� ����� �� 3 �� 8 ������ ���� 33
    }

    @Test
    public void whenSumFrom1To1Then1() {
        int result = Counter.sum(1, 1);
        assertEquals(1, result); // ����� ����� �� 1 �� 1 ������ ���� 1
    }

    @Test
    public void whenStartGreaterThanFinishThen0() {
        int result = Counter.sum(5, 3);
        assertEquals(0, result); // ���� start ������ finish, ��������� ������ ���� 0
    }


}

