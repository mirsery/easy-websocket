package com.mirsery.easy.page;

import com.mirsery.easy.ProjectCommon;
import com.mirsery.easy.page.panel.ClientModePanel;
import com.mirsery.easy.page.panel.ServerModePanel;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import javax.swing.*;
import java.awt.*;

/**
 * easy-websocket
 *
 * @author mirsery
 * @date 2022/12/27
 */
@Component
public class MainPanel extends JPanel {

    @Resource
    private ClientModePanel clientModePanel;

    @Resource
    private ServerModePanel serverModePanel;

    private CardLayout cardLayout;


    public void init() {
        clientModePanel.init();
        serverModePanel.init();

        cardLayout = new CardLayout(10, 10);
        this.setLayout(cardLayout);

        this.add(ProjectCommon.clientMode, clientModePanel);    //clientMode default
        this.add(ProjectCommon.serverMode, serverModePanel);
    }

    public void showMode(String mode) {

        if (mode.equals(ProjectCommon.clientMode)) {
            clientModePanel.reset();
        } else {
            serverModePanel.reset();
        }

        cardLayout.show(this, mode);
    }
}
