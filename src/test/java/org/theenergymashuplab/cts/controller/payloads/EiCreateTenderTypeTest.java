package org.theenergymashuplab.cts.controller.payloads;

import org.theenergymashuplab.cts.model.EiTenderModel;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;

import java.util.HashMap;
import java.util.Map;

import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
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
    public void add() throws Exception {
        EiTenderModel bks = new EiTenderModel();
        bks.setTenderID(12334);
        bks.setEmixBase("434fsdfssdq2mn3123mnxcvxc");
        bks.setTransactionID(4234234);
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