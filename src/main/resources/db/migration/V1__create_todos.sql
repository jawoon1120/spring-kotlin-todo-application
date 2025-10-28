create table post (
      created_at timestamp(6) not null,
      deleted_at timestamp(6),
      updated_at timestamp(6) not null,
      id UUID not null,
      content varchar(255),
      title varchar(255),
      primary key (id)
);