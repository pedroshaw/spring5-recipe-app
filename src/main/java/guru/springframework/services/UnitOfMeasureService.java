package guru.springframework.services;

import guru.springframework.commands.UnitOfMeasureCommand;

import java.util.Set;

/**
 * Created by: p_sha on: Thu 20 May 2021
 */
public interface UnitOfMeasureService {

    Set<UnitOfMeasureCommand> listAllUoms();

}
