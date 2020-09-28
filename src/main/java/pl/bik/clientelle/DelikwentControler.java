package pl.bik.clientelle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/delikwent")
public class DelikwentControler {
	
    @Autowired
    JdbcTemplate jdbcTemplate;
    
	@Autowired
	private DelikwentRepositoryInterface DelikwentRepository;
	
    @GetMapping(path = "/all")
    public @ResponseBody List<Delikwent> getAllDelikwent(){
        final List<Delikwent> all = (List<Delikwent>) DelikwentRepository.findAll();
        return all;
    }
    
    @GetMapping(path = "/allarray")
    public @ResponseBody String[] getAllDelikwentArray(){

        String output = "";
        String[] output_array = new String[(int) DelikwentRepository.count()];
        int i = 0;

        SqlRowSet row = jdbcTemplate.queryForRowSet("select imie from delikwent");

        while (row.next()) {
         output = output + "," + row.getString("imie");
         output_array[i] = row.getString("imie");
         i++;
        }

        return output_array;
    }

    @GetMapping(path = "/count")
    public @ResponseBody int getCountDelikwent(){
        final List<Delikwent> all = (List<Delikwent>) DelikwentRepository.findAll();
        final int cnt = all.size();
        return cnt;
    }
    
    @GetMapping(path = "/find/{id}")
    Optional<Delikwent> getDelikwentByID(@PathVariable int id){
    	return DelikwentRepository.findById(id);
    }
    
}
