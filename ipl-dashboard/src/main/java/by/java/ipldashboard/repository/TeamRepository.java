package by.java.ipldashboard.repository;

import org.springframework.data.repository.CrudRepository;

import by.java.ipldashboard.model.Team;

public interface TeamRepository extends CrudRepository<Team, Long>{

    Team findByTeamName(String teamName);
    
}
