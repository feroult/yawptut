package yawptut.actions;

import io.yawp.commons.http.annotation.PUT;
import io.yawp.repository.IdRef;
import io.yawp.repository.actions.Action;
import yawptut.models.Person;

public class PersonAction extends Action<Person> {

    @PUT("upper")
    public void upper(IdRef<Person> id) {
        Person person = id.fetch();
        person.setName(person.getName().toUpperCase());
        yawp.save(person);
    }
}