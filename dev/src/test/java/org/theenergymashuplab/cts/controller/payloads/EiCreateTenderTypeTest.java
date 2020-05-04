package org.theenergymashuplab.cts.controller.payloads;

import org.theenergymashuplab.cts.model.EiTenderModel;
import org.theenergymashuplab.cts.model.TenderId;
import org.theenergymashuplab.cts.model.TransactiveStateType;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;

import java.time.Instant;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.junit.Assert.*;
//import static org.springframework.security.test.web.servlet.request.SecurityMockMvcRequestPostProcessors.user;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/*
public class EiCreateTenderTypeTest {

    @Test
    void home() {
    }

    @Test
    void createTender() {
    }

    @Test
    void getCreatedTender() {
    }

    @Test
    void deleteBook() {
    }

    @Test
    void getAllTenders() {
    }
}
*/

@RunWith(SpringRunner.class)
@WebAppConfiguration
@WebMvcTest(EiCreateTenderType.class)
public class EiCreateTenderTypeTest {
    /*@Autowired
    private EiTenderType tenderDao;*/
    @Autowired
    private MockMvc mvc;

    @MockBean
    private EiCreateTenderType eCTT;

    @Test
    public void home() throws Exception {
        //EiCreateTenderType eCTT = new EiCreateTenderType();
        mvc.perform(get("http://localhost:8080/tenders/"))
                .andExpect(status().isOk());
    }
    
    @Test
    public void passtest() throws Exception {
        assertEquals('h', 'h');
    }

    @Test
    public void add() throws Exception {
        EiTenderModel bks = new EiTenderModel();
        TenderId tid = new TenderId();
        bks.setTenderID(tid.value());
        bks.setDuration(90000);
        bks.setExpireTime(null);
        bks.setQuantity(10);
        
        Calendar c1 = Calendar.getInstance();
        Date dateOne = c1.getTime();
        String inst = dateOne.toString(); 
        
        bks.setStartTime(inst);
        bks.setTransactiveState(TransactiveStateType.TRANSACTION);
        
        //bks.setRefID(3421);

        Map<String, String> map = new HashMap<>();

        map.put("tenderID", "12334");
        map.put("emixBase", "434fsdfssdq2mn3123mnxcvxc");
        map.put("transactionID", "4234234");
        mvc.perform(post("http://localhost:8080/tenders/add"))
                .andExpect(status().isOk());
                /*.andExpect(status().isOk());
                .contentType(APPLICATION_JSON);*/
    }

    /*@Test
    public void getArrivalsById() throws Exception {
        Arrival arrival = new Arrival();
        arrival.setCity("Yerevan");

        given(arrivalController.getArrivalById(arrival.getId())).willReturn(arrival);

        mvc.perform(get(VERSION + ARRIVAL + arrival.getId())
                .with(user("blaze").password("Q1w2e3r4"))
                .contentType(APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("city", is(arrival.getCity())));
    }*/
}