package pl.bik.clientelle;

import javax.persistence.*;

@Entity
@Table (name="delikwent")
public class Delikwent {
	
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Integer id;
    private String  imie;
    private String  nazwisko;
    private String  pesel;
    private String  rating;
    private String  fotka;
    
    
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getImie() {
		return imie;
	}
	public void setImie(String imie) {
		this.imie = imie;
	}
	public String getNazwisko() {
		return nazwisko;
	}
	public void setNazwisko(String nazwisko) {
		this.nazwisko = nazwisko;
	}
	public String getPesel() {
		return pesel;
	}
	public void setPesel(String pesel) {
		this.pesel = pesel;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	public String getFotka() {
		return fotka;
	}
	public void setFotka(String fotka) {
		this.fotka = fotka;
	}


}
