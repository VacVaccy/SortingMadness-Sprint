package pl.put.poznan.sorter.rest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import pl.put.poznan.sorter.logic.DataCheckService;
import pl.put.poznan.sorter.logic.SortingMadness;
import pl.put.poznan.sorter.logic.SortingResponse;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

class SortingMadnessControllerTest {
    @InjectMocks
    private SortingMadnessController controller;

    @Mock
    private SortingMadness sorter;
    @Mock
    private DataCheckService dataCheckService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }




    @Test
    void testGetWithNumericData() throws IllegalAccessException {
        // Arrange
        String[] data = {"3", "1", "2"};
        String[] algorithms = {"1"};
        int[] parsedData = {3, 1, 2};

        SortingResponse response1 = new SortingResponse("Bubble sort", new int[]{3, 1, 2},new int[]{1, 2, 3},1);
        List<SortingResponse> expectedResponses = List.of(response1);
        expectedResponses.forEach(e -> e.setSortingTime(1));


        when(dataCheckService.isNumericArray(data)).thenReturn(true);
        when(sorter.sortInts(parsedData)).thenReturn(expectedResponses);

        // Act
        List<SortingResponse> actualResponses = controller.get(data, algorithms);
        actualResponses.forEach(e -> e.setSortingTime(1));


        assertEquals(expectedResponses.get(0).toString(), actualResponses.get(0).toString());

        verify(dataCheckService).isNumericArray(data);
    }



}