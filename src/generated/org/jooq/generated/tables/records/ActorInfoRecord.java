/*
 * This file is generated by jOOQ.
 */
package org.jooq.generated.tables.records;


import org.jooq.generated.tables.JActorInfo;
import org.jooq.generated.tables.pojos.ActorInfo;
import org.jooq.impl.TableRecordImpl;


/**
 * VIEW
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ActorInfoRecord extends TableRecordImpl<ActorInfoRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>sakila.actor_info.actor_id</code>.
     */
    public ActorInfoRecord setActorId(Long value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>sakila.actor_info.actor_id</code>.
     */
    public Long getActorId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>sakila.actor_info.first_name</code>.
     */
    public ActorInfoRecord setFirstName(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>sakila.actor_info.first_name</code>.
     */
    public String getFirstName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>sakila.actor_info.last_name</code>.
     */
    public ActorInfoRecord setLastName(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>sakila.actor_info.last_name</code>.
     */
    public String getLastName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>sakila.actor_info.film_info</code>.
     */
    public ActorInfoRecord setFilmInfo(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>sakila.actor_info.film_info</code>.
     */
    public String getFilmInfo() {
        return (String) get(3);
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ActorInfoRecord
     */
    public ActorInfoRecord() {
        super(JActorInfo.ACTOR_INFO);
    }

    /**
     * Create a detached, initialised ActorInfoRecord
     */
    public ActorInfoRecord(Long actorId, String firstName, String lastName, String filmInfo) {
        super(JActorInfo.ACTOR_INFO);

        setActorId(actorId);
        setFirstName(firstName);
        setLastName(lastName);
        setFilmInfo(filmInfo);
        resetChangedOnNotNull();
    }

    /**
     * Create a detached, initialised ActorInfoRecord
     */
    public ActorInfoRecord(ActorInfo value) {
        super(JActorInfo.ACTOR_INFO);

        if (value != null) {
            setActorId(value.getActorId());
            setFirstName(value.getFirstName());
            setLastName(value.getLastName());
            setFilmInfo(value.getFilmInfo());
            resetChangedOnNotNull();
        }
    }
}
