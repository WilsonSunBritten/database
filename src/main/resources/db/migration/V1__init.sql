CREATE TABLE IF NOT EXISTS test_table(
    test_table_id   uuid    NOT NULL PRIMARY KEY,
    test_simple_data    TEXT,
    test_complex_data   jsonb
);