(ns miraj.paper)

(alter-meta! *ns*
             (fn [m] (assoc m
                            :co-ns true
                            :resource-type :polymer
                            :resource-pfx "bower_components")))

(def pfx "bower_components")

;; bower install --save PolymerElements/paper-card

(def components
  {:button {:html :paper-button
            :uri (str pfx "/paper-button/paper-button.html") ;; used at runtime to make <link>
            :bower "PolymerElements/paper-card"  ;; used at build time for bower install
            }
   :card {:html :paper-card
          :uri (str pfx "/paper-card/paper-card.html")
          :bower "PolymerElements/paper-button"}})


(def components-old
  ;; entries:  {:fn-tag  {elt-kw elt-uri & docstring}}
  {:badge {:paper-badge "paper-badge/paper-badge.html"}
   :button {:paper-button "paper-button/paper-button.html"}
   :card {:paper-card "paper-card/paper-card.html"}
   :checkbox {:paper-checkbox "paper-checkbox/paper-checkbox.html"}
   :dialog {:paper-dialog "paper-dialog/paper-dialog.html"}
   :dialog-behavior {:paper-dialog-behavior "paper-dialog-behavior/paper-dialog-behavior.html"}
   :dialog-scrollable {:paper-dialog-scrollable "paper-dialog-scrollable/paper-dialog-scrollable.html"}
   :drawer-panel {:paper-drawer-panel "paper-drawer-panel/paper-drawer-panel.html"}
   :dropdown-menu {:paper-dropdown-menu "paper-dropdown-menu/paper-dropdown-menu.html"}
   :fab {:paper-fab "paper-fab/paper-fab.html"}
   :header-panel {:paper-header-panel "paper-header-panel/paper-header-panel.html"}
   :icon-button {:paper-icon-button "paper-icon-button/paper-icon-button.html"}
   :input {:paper-input "paper-input/paper-input.html"}
   :textarea {:paper-textarea "paper-input/paper-textarea.html"}
   :item {:paper-item "paper-item/paper-item.html"}
   :listbox {:paper-listbox "paper-listbox/paper-listbox.html"}
   :material {:paper-material "paper-material/paper-material.html"}
   :menu {:paper-menu "paper-menu/paper-menu.html"}
   :menu-shared-styles {:paper-menu-shared-styles "paper-menu/paper-menu-shared-styles.html.html"}
   :submenu {:paper-submenu "paper-menu/paper-submenu.html"}
   :menu-button {:paper-menu-button "paper-menu-button/paper-menu-button.html"}
   :menu-button-animations {:paper-menu-button-animations "paper-menu-button/paper-menu-button-animations.html"}
   :progress {:paper-progress "paper-progress/paper-progress.html"}
   :radio-button {:paper-radio-button "paper-radio-button/paper-radio-button.html"}
   :radio-group {:paper-radio-group "paper-radio-group/paper-radio-group.html"}
   :ripple {:paper-ripple "paper-ripple/paper-ripple.html"}
   :scroll-header-panel {:paper-scroll-header-panel "paper-scroll-header-panel/paper-scroll-header-panel.html"}
   :slider {:paper-slider "paper-slider/paper-slider.html"}
   :spinner {:paper-spinner "paper-spinner/paper-spinner.html"}
   :styles {:paper-styles "paper-styles/paper-styles.html"}
   :tab {:paper-tab "paper-tabs/paper-tab.html"}
   :tabs {:paper-tabs "paper-tabs/paper-tabs.html"}
   :toast {:paper-toast "paper-toast/paper-toast.html"}
   :toggle-button {:paper-toggle-button	"paper-toggle-button/paper-toggle-button.html"}
   :toolbar {:paper-toolbar "paper-toolbar/paper-toolbar.html"}
   :tooltip {:paper-tooltip "paper-tooltip/paper-tooltip"}})

