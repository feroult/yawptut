package yawptut.shields;

import io.yawp.repository.IdRef;
import io.yawp.repository.shields.Shield;
import yawptut.models.Person;

public class PersonShield extends Shield<Person> {

    @Override
    public void show(IdRef<Person> id) {
        allow();
    }

}