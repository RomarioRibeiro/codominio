
    create table administrador (
       id integer not null auto_increment,
        cpf varchar(255),
        nome varchar(255),
        primary key (id)
    ) engine=InnoDB

    create table apartamento (
       id integer not null auto_increment,
        numero integer not null,
        bloco_id integer,
        primary key (id)
    ) engine=InnoDB

    create table bloco (
       id integer not null auto_increment,
        descricao varchar(255),
        condominio_id integer,
        endereco_id integer,
        primary key (id)
    ) engine=InnoDB

    create table condominio (
       id integer not null auto_increment,
        cnpj integer,
        end_id integer,
        primary key (id)
    ) engine=InnoDB

    create table endereco (
       id integer not null auto_increment,
        uf varchar(255),
        bairro varchar(255),
        cep varchar(255),
        cidade varchar(255),
        complemento varchar(255),
        logrador varchar(255),
        primary key (id)
    ) engine=InnoDB

    create table morador (
       id integer not null auto_increment,
        cpf varchar(255),
        data_nasc datetime(6),
        nome varchar(255),
        apatamento_id integer,
        seguro_id integer,
        primary key (id)
    ) engine=InnoDB

    create table seguranca (
       id integer not null auto_increment,
        cpf varchar(255),
        data_admisao datetime(6),
        nome varchar(255),
        primary key (id)
    ) engine=InnoDB

    create table visitante (
       id integer not null auto_increment,
        cpf varchar(255),
        nome varchar(255),
        morador_id integer,
        primary key (id)
    ) engine=InnoDB

    alter table apartamento 
       add constraint FKj6ppcs2lqohdd193jyoqp2pyl 
       foreign key (bloco_id) 
       references bloco (id)

    alter table bloco 
       add constraint FKiaa4fng9gn6s3cpiec3kw7gj7 
       foreign key (condominio_id) 
       references condominio (id)

    alter table bloco 
       add constraint FKgwdfm8qlt750esci4hfnxokoa 
       foreign key (endereco_id) 
       references endereco (id)

    alter table condominio 
       add constraint FK4siij3r29pchrsn7ffh7vgkja 
       foreign key (end_id) 
       references endereco (id)

    alter table morador 
       add constraint FKf3fgvux4d9bbl86pss8vfjcne 
       foreign key (apatamento_id) 
       references apartamento (id)

    alter table morador 
       add constraint FKedvug51v6njjp76jfavx1a8yj 
       foreign key (seguro_id) 
       references seguranca (id)

    alter table visitante 
       add constraint FKhk8opg7yu6v7ebu82ugphbwxq 
       foreign key (morador_id) 
       references morador (id)

    create table administrador (
       id integer not null auto_increment,
        cpf varchar(255),
        nome varchar(255),
        primary key (id)
    ) engine=InnoDB

    create table apartamento (
       id integer not null auto_increment,
        numero integer not null,
        bloco_id integer,
        primary key (id)
    ) engine=InnoDB

    create table bloco (
       id integer not null auto_increment,
        descricao varchar(255),
        condominio_id integer,
        endereco_id integer,
        primary key (id)
    ) engine=InnoDB

    create table condominio (
       id integer not null auto_increment,
        cnpj integer,
        end_id integer,
        primary key (id)
    ) engine=InnoDB

    create table endereco (
       id integer not null auto_increment,
        uf varchar(255),
        bairro varchar(255),
        cep varchar(255),
        cidade varchar(255),
        complemento varchar(255),
        logrador varchar(255),
        primary key (id)
    ) engine=InnoDB

    create table morador (
       id integer not null auto_increment,
        cpf varchar(255),
        data_nasc datetime(6),
        nome varchar(255),
        apatamento_id integer,
        seguro_id integer,
        primary key (id)
    ) engine=InnoDB

    create table seguranca (
       id integer not null auto_increment,
        cpf varchar(255),
        data_admisao datetime(6),
        nome varchar(255),
        primary key (id)
    ) engine=InnoDB

    create table visitante (
       id integer not null auto_increment,
        cpf varchar(255),
        nome varchar(255),
        morador_id integer,
        primary key (id)
    ) engine=InnoDB

    alter table apartamento 
       add constraint FKj6ppcs2lqohdd193jyoqp2pyl 
       foreign key (bloco_id) 
       references bloco (id)

    alter table bloco 
       add constraint FKiaa4fng9gn6s3cpiec3kw7gj7 
       foreign key (condominio_id) 
       references condominio (id)

    alter table bloco 
       add constraint FKgwdfm8qlt750esci4hfnxokoa 
       foreign key (endereco_id) 
       references endereco (id)

    alter table condominio 
       add constraint FK4siij3r29pchrsn7ffh7vgkja 
       foreign key (end_id) 
       references endereco (id)

    alter table morador 
       add constraint FKf3fgvux4d9bbl86pss8vfjcne 
       foreign key (apatamento_id) 
       references apartamento (id)

    alter table morador 
       add constraint FKedvug51v6njjp76jfavx1a8yj 
       foreign key (seguro_id) 
       references seguranca (id)

    alter table visitante 
       add constraint FKhk8opg7yu6v7ebu82ugphbwxq 
       foreign key (morador_id) 
       references morador (id)
