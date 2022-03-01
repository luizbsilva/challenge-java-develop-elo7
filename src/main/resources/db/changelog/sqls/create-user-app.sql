CREATE TABLE public.user_data_migration (
                                            id            int8 not null,
                                            email         varchar(255) null,
                                            name          varchar(255) not null,
                                            password      varchar(255) not null,
                                            profile       int4 null,
                                            create_date     timestamp not null,
                                            update_date     timestamp,
                                            active        boolean,
                                            constraint user_data_migration_pkey primary key (id)
);

CREATE SEQUENCE public.user_data_migration_id_seq
    INCREMENT 1
    MINVALUE 1
    MAXVALUE 9223372036854775807
    START 1
    CACHE 1;
ALTER TABLE public.user_data_migration_id_seq OWNER TO postgres;
ALTER TABLE public.user_data_migration ALTER COLUMN id SET DEFAULT nextval('public.user_data_migration_id_seq'::regclass);

INSERT INTO public.user_data_migration (email, name, password, profile, create_date, active) VALUES('teste@email.com', 'Teste Elo7', '$2a$10$tShl6Jqp.BNdhgs3VDIcnOldQJhFlHXP41WuWjQ9LLGgr8ROWoC1S', 1, '2022-02-28 19:54:11.000000', true);
