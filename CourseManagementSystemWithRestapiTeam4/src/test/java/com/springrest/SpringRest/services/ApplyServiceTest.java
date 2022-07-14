package com.springrest.SpringRest.services;

import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.springrest.SpringRest.Repository.ApplyRepo;
import com.springrest.SpringRest.entities.Apply;

import java.util.ArrayList;
import java.util.Collection;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ContextConfiguration(classes = {ApplyService.class})
@ExtendWith(SpringExtension.class)
class ApplyServiceTest {
    @MockBean
    private ApplyRepo applyRepo;

    @Autowired
    private ApplyService applyService;

    /**
     * Method under test: {@link ApplyService#getAllAdmin()}
     */
    @Test
    void testGetAllAdmin() {
        ArrayList<Apply> applyList = new ArrayList<>();
        when(applyRepo.findAll()).thenReturn(applyList);
        Object actualAllAdmin = applyService.getAllAdmin();
        assertSame(applyList, actualAllAdmin);
        assertTrue(((Collection<Object>) actualAllAdmin).isEmpty());
        verify(applyRepo).findAll();
    }

    /**
     * Method under test: {@link ApplyService#saveApplyDetail(Apply)}
     */
    @Test
    void testSaveApplyDetail() {
        Apply apply = new Apply();
        apply.setCourse_id(1);
        apply.setCourse_name("Course name");
        apply.setDuration("Duration");
        apply.setFees(1);
        apply.setFirst_name("Jane");
        apply.setLast_name("Doe");
        when(applyRepo.save((Apply) any())).thenReturn(apply);

        Apply apply1 = new Apply();
        apply1.setCourse_id(1);
        apply1.setCourse_name("Course name");
        apply1.setDuration("Duration");
        apply1.setFees(1);
        apply1.setFirst_name("Jane");
        apply1.setLast_name("Doe");
        assertSame(apply, applyService.saveApplyDetail(apply1));
        verify(applyRepo).save((Apply) any());
    }
}

