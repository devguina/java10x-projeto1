ALTER TABLE tb_ninja
ADD COLUMN missao_id UUID;

ALTER TABLE tb_ninja
ADD CONSTRAINT fk_ninja_missao
FOREIGN KEY (missao_id)
REFERENCES tb_missao (id)
ON DELETE CASCADE;