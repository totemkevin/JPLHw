isParent(A, B) :- isMom(A, B).  % A �O B ���������ܡA���� A �O B ������
isParent(A, B) :- isDad(A, B).  % A �O B ���������ܡA���� A �O B ������
isGrandParent(A, C) :- isParent(A, B), isParent(B, C).  % A �O B �������B B �O C ���������ܡA���� A �O C �������ί���

isMom('��ֱ�', '���g��').
isMom('����}', '������').
isMom('����}', '�����Z').
isDad('������', '���g��').
isDad('���g��', '������').
isDad('���g��', '�����Z').
