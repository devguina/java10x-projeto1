ALTER TABLE tb_ninja
ADD COLUMN aldeia_id UUID;

ALTER TABLE tb_ninja
ADD CONSTRAINT fk_ninja_aldeia
FOREIGN KEY (aldeia_id)
REFERENCES tb_aldeia (id)
ON DELETE CASCADE;