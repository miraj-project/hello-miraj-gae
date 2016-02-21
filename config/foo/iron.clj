(ns miraj.iron
  (:refer-clojure :exclude [list meta]))
  ;; (:require [miraj.markup :refer [make-resource-fns]]))

(alter-meta! *ns*
             (fn [m] (assoc m
                            :co-ns true
                            :resource-type :polymer
                            :resource-pfx "bower_components")))

(def pfx "bower_components")

(def components
  {:icon {:html :iron-icon
          :url (str pfx "/iron-icon/iron-icon.html")
          :bower "PolymerElments/iron-icon"}
   :icons {:html :iron-icons
           :uri (str pfx "/iron-icons/iron-icons.html")
           :bower "PolymerElments/iron-icons"}})

(def components-old
  {:a11y-announcer {:iron-a11y-announcer "iron-a11y-announcer/iron-a11y-announcer.html"}
   :a11y-keys {:iron-a11y-keys "iron-a11y-keys/iron-a11y-keys.html"}
   :a11y-keys-behavior {:iron-a11y-keys-behavior "iron-a11y-keys-behavior/iron-a11y-keys-behavior.html"}
   :ajax {:iron-ajax "iron-ajax/iron-ajax.html"}
   :autogrow-textarea {:iron-autogrow-textarea "iron-autogrow-textarea/iron-autogrow-textarea.html"}
   :behaviors {:iron-behaviors "iron-behaviors/iron-behaviors.html"}
   :checked-element-behavior {:iron-checked-element-behavior "iron-checked-element-behavior/iron-checked-element-behavior.html"}
   :collapse {:iron-collapse "iron-collapse/iron-collapse.html"}
   :component-page {:iron-component-page "iron-component-page/iron-component-page.html"}
   :doc-viewer {:iron-doc-viewer "iron-doc-viewer/iron-doc-viewer.html"}
   :dropdown {:iron-dropdown "iron-dropdown/iron-dropdown.html"}
   :fit-behavior {:iron-fit-behavior "iron-fit-behavior/iron-fit-behavior.html"}
   :flex-layout {:iron-flex-layout "iron-flex-layout/iron-flex-layout.html"}
   :form {:iron-form "iron-form/iron-form.html"}
   :form-element-behavior {:iron-form-element-behavior "iron-form-element-behavior/iron-form-element-behavior.html"}
   :icon {:iron-icon "iron-icon/iron-icon.html"}
   :icons {:iron-icons "iron-icons/iron-icons.html"}
   :iconset {:iron-iconset "iron-iconset/iron-iconset.html"}
   :iconset-svg {:iron-iconset-svg "iron-iconset-svg/iron-iconset-svg.html"}
   :image {:iron-image "iron-image/iron-image.html"}
   :input {:iron-input "iron-input/iron-input.html"}
   :jsonp-library {:iron-jsonp-library "iron-jsonp-library/iron-jsonp-library.html"}
   :label {:iron-label "iron-label/iron-label.html"}
   :list {:iron-list "iron-list/iron-list.html"}
   :localstorage {:iron-localstorage "iron-localstorage/iron-localstorage.html"}
   :media-query {:iron-media-query "iron-media-query/iron-media-query.html"}
   :menu-behavior {:iron-menu-behavior "iron-menu-behavior/iron-menu-behavior.html"}
   :meta {:iron-meta "iron-meta/iron-meta.html"}
   :overlay-behavior {:iron-overlay-behavior "iron-overlay-behavior/iron-overlay-behavior.html"}
   :pages {:iron-pages "iron-pages/iron-pages.html"}
   :range-behavior {:iron-range-behavior "iron-range-behavior/iron-range-behavior.html"}
   :request {:iron-request "iron-ajax/iron-request.html"}
   :resizable-behavior {:iron-resizable-behavior "iron-resizable-behavior/iron-resizable-behavior.html"}
   :selector {:iron-selector "iron-selector/iron-selector.html"}
   :signals {:iron-signals "iron-signals/iron-signals.html"}
   :swipeable-container {:iron-swipeable-container "iron-swipeable-container/iron-swipeable-container.html"}
   :test-helpers {:iron-test-helpers "iron-test-helpers/iron-test-helpers.html"}
   :validatable-behavior {:iron-validatable-behavior "iron-validatable-behavior/iron-validatable-behavior.html"}
   :validator-behavior {:iron-validator-behavior "iron-validator-behavior/iron-validator-behavior.html"}})
