package ru.mts.homework.service.currentuser;

import ru.mts.homework.domain.CurrentUser;

public interface CurrentUserService {

    boolean canAccessUser(CurrentUser currentUser, Long userId);

}
