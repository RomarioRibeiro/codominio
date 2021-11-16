    create table administrador (
       id integer not null auto_increment,
        cpf varchar(255),
        nome varchar(255),
        primary key (id)
    ) engine=InnoDB default charset=utf8MB4;
 
    
    create table apartamento (
       id integer not null auto_increment,
        numero integer not null,
        bloco_id integer,
        primary key (id)
    ) engine=InnoDB default charset=utf8MB4;
 
    
    create table bloco (
       id integer not null auto_increment,
        descricao varchar(255),
        condominio_id integer,
        endereco_id integer,
        primary key (id)
    ) engine=InnoDB default charset=utf8MB4;
 
    
    create table condominio (
       id integer not null auto_increment,
        cnpj integer,
        end_id integer,
        primary key (id)
    ) engine=InnoDB default charset=utf8MB4;
 
    
    create table endereco (
       id integer not null auto_increment,
        uf varchar(255),
        bairro varchar(255),
        cep varchar(255),
        cidade varchar(255),
        complemento varchar(255),
        logrador varchar(255),
        primary key (id)
    ) engine=InnoDB default charset=utf8MB4;
 
    
    create table morador (
       id integer not null auto_increment,
        cpf varchar(255),
        data_nasc datetime(6),
        nome varchar(255),
        apartamento_id integer,
        seguro_id integer,
        primary key (id)
    ) engine=InnoDB default charset=utf8MB4;
 

    
    create table seguranca (
       id integer not null auto_increment,
        cpf varchar(255),
        data_admisao datetime(6),
        nome varchar(255),
        primary key (id)
    ) engine=InnoDB default charset=utf8MB4;

    
    create table visitante (
       id integer not null auto_increment,
        cpf varchar(255),
        nome varchar(255),
        morador_id integer,
        primary key (id)
    ) engine=InnoDB default charset=utf8MB4;
 
    
    alter table apartamento 
       add constraint FKBloco_apartamento 
       foreign key (bloco_id) 
       references bloco (id);
 
    
    alter table bloco 
       add constraint FKcondominio_bloco
       foreign key (condominio_id) 
       references condominio (id);
 
    
    alter table bloco 
       add constraint FKendereco_Bloco
       foreign key (endereco_id) 
       references endereco (id);
 
    
    alter table condominio 
       add constraint FKend_Condominio
       foreign key (end_id) 
       references endereco (id);
 
    
    alter table morador 
       add constraint FKapartamento_morador
       foreign key (apartamento_id) 
       references apartamento (id);
 
    
    alter table morador 
       add constraint FKseguranca_morador
       foreign key (seguro_id) 
       references seguranca (id);
 
    
    alter table visitante 
       add constraint FKmorador_isitante
       foreign key (morador_id) 
       references morador (id);