INSERT INTO insurance (id, name) VALUES (1, 'INSURANCE_1');
INSERT INTO insurance (id, name) VALUES (2, 'INSURANCE_2');

INSERT INTO insurance_bullet (id, insurance_id, name) VALUES (1, 1, 'BULLET_1_1');
INSERT INTO insurance_bullet (id, insurance_id, name) VALUES (2, 1, 'BULLET_1_2');
INSERT INTO insurance_bullet (id, insurance_id, name) VALUES (3, 1, 'BULLET_1_3');
INSERT INTO insurance_bullet (id, insurance_id, name) VALUES (4, 2, 'BULLET_2_1');
INSERT INTO insurance_bullet (id, insurance_id, name) VALUES (5, 2, 'BULLET_2_2');

INSERT INTO insurance_comparison (id, coverage, ipd, opd) VALUES (1, 'COVERAGE_1', 'IPD_1', 'OPD_1');
INSERT INTO insurance_comparison (id, coverage, ipd, opd) VALUES (2, 'COVERAGE_2', 'IPD_2', 'OPD_2');