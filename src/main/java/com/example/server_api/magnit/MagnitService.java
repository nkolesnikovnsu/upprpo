package com.example.server_api.magnit;

import java.util.List;

public interface MagnitService {

    /**
     * Создает нового клиента
     * @param Magnit - клиент для создания
     */
    void create(Magnit magnit);

    /**
     * Возвращает список всех имеющихся клиентов
     * @return список клиентов
     */
    List<Magnit> readAll();

    /**
     * Возвращает клиента по его ID
     * @param id - ID клиента
     * @return - объект клиента с заданным ID
     */
    Magnit read(int id);

    /**
     * Обновляет клиента с заданным ID,
     * в соответствии с переданным клиентом
     * @param Magnit - клиент в соответсвии с которым нужно обновить данные
     * @param id - id клиента которого нужно обновить
     * @return - true если данные были обновлены, иначе false
     */
    boolean update(Magnit magnit, int id);

    /**
     * Удаляет клиента с заданным ID
     * @param id - id клиента, которого нужно удалить
     * @return - true если клиент был удален, иначе false
     */
    boolean delete(int id);
}