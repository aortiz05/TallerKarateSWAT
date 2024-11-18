package examples.pet;

import com.intuit.karate.junit5.Karate;

class PetsTestRunner {
    
    @Karate.Test
    Karate testUsers() {
        return Karate.run("PetsRequest").relativeTo(getClass());
    }    

}
