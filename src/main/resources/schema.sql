CREATE TABLE trade
  (
     product VARCHAR(255),
     portfolio VARCHAR(255),
     book VARCHAR(255),
     tradeId NUMBER,
     submitterId NUMBER,
     submitterDealId NUMBER,
     dealType VARCHAR(255),
     bidType VARCHAR(255),
     currentValue NUMBER,
     previousValue NUMBER,
     pl1 NUMBER,
     pl2 NUMBER,
     gainDx NUMBER,
     sxPx NUMBER,
     x99Out NUMBER,
     batch NUMBER
  );
  
  insert into trade values('abc','abcd','book',1,1,1,'dealtype','bidtype',1,1,1,1,1,1,1,1);
  insert into trade values('xyz','xyxz','book1',1,1,1,'dealtype1','bidtype1',1,1,1,1,1,1,1,1);
  insert into trade values('abc2','abcd2','book2',1,1,1,'dealtype2','bidtype2',1,1,1,1,1,1,1,1);
   insert into trade values('abc3','abcd3','book3',1,1,1,'dealtype3','bidtype3',1,1,1,1,1,1,1,1);
    insert into trade values('abc4','abcd4','book4',1,1,1,'dealtype4','bidtype4',1,1,1,1,1,1,1,1);
     insert into trade values('abc5','abcd5','book5',1,1,1,'dealtype5','bidtype5',1,1,1,1,1,1,1,1);
      insert into trade values('abc6','abcd6','book6',1,1,1,'dealtype6','bidtype6',1,1,1,1,1,1,1,1);
       insert into trade values('abc7','abcd7','book2',1,1,1,'dealtype7','bidtype7',1,1,1,1,1,1,1,1); 
       insert into trade values('abc8','abcd8','book8',1,1,1,'dealtype8','bidtype8',1,1,1,1,1,1,1,1);
        insert into trade values('abc9','abcd9','book9',1,1,1,'dealtype9','bidtype9',1,1,1,1,1,1,1,1);
         insert into trade values('abc10','abcd10','book10',1,1,1,'dealtype10','bidtype10',1,1,1,1,1,1,1,1);
          insert into trade values('abc11','abcd11','book11',1,1,1,'dealtype11','bidtype11',1,1,1,1,1,1,1,1);
           insert into trade values('abc12','abcd12','book12',1,1,1,'dealtype12','bidtype12',1,1,1,1,1,1,1,1);