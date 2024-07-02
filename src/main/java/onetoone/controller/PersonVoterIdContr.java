package onetoone.controller;

import onetoone.dao.PersonnDao;
import onetoone.dao.VoterIdDao;
import onetoone.dto.PersonDto;
import onetoone.dto.VoterDto;

public class PersonVoterIdContr {
public static void main(String[] args) {
	PersonDto personDto=new PersonDto();
	personDto.setPersonId(1);
	personDto.setName("maha");
	personDto.setAddress("SALEM");
	
	PersonnDao personDao=new PersonnDao();
	personDao.savePerson(personDto);
	
	VoterDto voter=new VoterDto();
	voter.setVoterCardId(101);
	voter.setName("priya");
	voter.setAge(22);
	
	VoterIdDao voterDao=new VoterIdDao();
	voterDao.savevoterCard(1, voter);
}
}
