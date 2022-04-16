//package com.c.test;
//
//public class SampleSchduler {
//
//    @Scheduled(0 0/5 * * * *)
//    public void processData() {
//        // code to process
//        //1. Get/Poll the events from Queue in batch of 100
//        Check the records are not null
//            if not null then
//                loop records.next()
//                    call upstream API/method to load into DB
//                    processResult
//                            Success:
//                                ack//commit
//                            failure:
//                                1. retry with little delay
//                                2. Keep to other queue and retry after some time
//    }
//}
//
//
//TLSAuth -> DNS -> LB -> server -> process
//
////Private and public
//
//TCP connection
////connection string and port
//
//
