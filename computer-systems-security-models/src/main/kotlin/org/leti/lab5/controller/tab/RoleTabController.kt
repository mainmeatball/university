package org.leti.lab5.controller.tab

import javafx.fxml.FXML
import javafx.scene.control.TableView
import javafx.scene.control.TextField
import org.leti.lab4.component.SecurityFolderType
import org.leti.lab5.component.table.Role
import org.leti.lab5.component.table.User
import org.leti.lab5.service.UserRoleStateService


class RoleTabController {

    private val stateService = UserRoleStateService

    @FXML
    lateinit var roleTable: TableView<Role>

    @FXML
    lateinit var roleName: TextField

    @FXML
    fun initialize() {
        val userRole = stateService.initializeTable(roleTable, ROLE_TABLE_NAME)
        stateService.addRoleItems(roleTable, *userRole.roles.toTypedArray())
        SecurityFolderType.values().forEach {
            stateService.addNewColumn<Role>(ROLE_TABLE_NAME, it.value)
        }
        roleTable.isEditable = true
        stateService.saveState()
    }

    @FXML
    fun createNewRole() {
        val newRoleName = roleName.text ?: return
        roleName.clear()
        stateService.addRoleItemsAndSaveState(roleTable, Role(newRoleName))
    }

    companion object {
        private const val ROLE_TABLE_NAME = "Role"
    }
}