/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package openvr.templates

import org.lwjgl.generator.*
import openvr.*

val VRRenderModels = "VRRenderModels".nativeClass(
    Module.OPENVR,
    prefixMethod = "VRRenderModels_",
    library = OPENVR_LIBRARY,
    binding = OPENVR_FNTABLE_BINDING
) {
    documentation =
        """
        """

    EVRRenderModelError(
        "LoadRenderModel_Async",
        """
        Loads and returns a render model for use in the application. {@code pchRenderModelName} should be a render model name from the
        #ETrackedDeviceProperty_Prop_RenderModelName_String property or an absolute path name to a render model on disk.

        The resulting render model is valid until #ShutdownInternal() is called or until #FreeRenderModel() is called. When the application is finished with
        the render model it should call #FreeRenderModel() to free the memory associated with the model.
        """,

        charASCII.const.p("pchRenderModelName", ""),
        Check(1)..RenderModel_t.p.p("ppRenderModel", "")
    )

    void(
        "FreeRenderModel",
        "Frees a previously returned render model It is safe to call this on a null ptr.",

        nullable..RenderModel_t.p("pRenderModel", "")
    )

    EVRRenderModelError(
        "LoadTexture_Async",
        "Loads and returns a texture for use in the application.",

        TextureID_t("textureId", ""),
        Check(1)..RenderModel_TextureMap_t.p.p("ppTexture", "")
    )

    void(
        "FreeTexture",
        "Frees a previously returned texture. It is safe to call this on a null ptr.",

        nullable..RenderModel_TextureMap_t.p("pTexture", "")
    )

    EVRRenderModelError(
        "LoadTextureD3D11_Async",
        "Creates a D3D11 texture and loads data into it.",

        TextureID_t("textureId", ""),
        opaque_p("pD3D11Device", ""),
        Check(1)..void.p.p("ppD3D11Texture2D", "")
    )

    EVRRenderModelError(
        "LoadIntoTextureD3D11_Async",
        "Helper function to copy the bits into an existing texture.",

        TextureID_t("textureId", ""),
        opaque_p("pDstTexture", "")
    )

    void(
        "FreeTextureD3D11",
        "Use this to free textures created with LoadTextureD3D11_Async instead of calling Release on them.",

        opaque_p("pD3D11Texture2D", "")
    )

    uint32_t(
        "GetRenderModelName",
        """
        Use this to get the names of available render models. Index does not correlate to a tracked device index, but is only used for iterating over all
        available render models. If the index is out of range, this function will return 0. Otherwise, it will return the size of the buffer required for the
        name.
        """,

        uint32_t("unRenderModelIndex", ""),
        Return(RESULT, includesNT = true)..nullable..charASCII.p("pchRenderModelName", ""),
        AutoSize("pchRenderModelName")..uint32_t("unRenderModelNameLen", "")
    )

    uint32_t(
        "GetRenderModelCount",
        "Returns the number of available render models.",
        void()
    )

    uint32_t(
        "GetComponentCount",
        """
        Returns the number of components of the specified render model.

        Components are useful when client application wish to draw, label, or otherwise interact with components of tracked objects.
        """,

        charASCII.const.p("pchRenderModelName", "")
    )

    uint32_t(
        "GetComponentName",
        """
        Use this to get the names of available components. Index does not correlate to a tracked device index, but is only used for iterating over all
        available components. If the index is out of range, this function will return 0. Otherwise, it will return the size of the buffer required for the
        name.
        """,

        charASCII.const.p("pchRenderModelName", ""),
        uint32_t("unComponentIndex", ""),
        Return(RESULT, includesNT = true)..nullable..charASCII.p("pchComponentName", ""),
        AutoSize("pchComponentName")..uint32_t("unComponentNameLen", "")
    )

    uint64_t(
        "GetComponentButtonMask",
        """
        Get the button mask for all buttons associated with this component.

        If no buttons (or axes) are associated with this component, return 0

        ${note("multiple components may be associated with the same button. Ex: two grip buttons on a single controller.")}
        ${note("A single component may be associated with multiple buttons. Ex: A trackpad which also provides \"D-pad\" functionality")}
        """,

        charASCII.const.p("pchRenderModelName", ""),
        charASCII.const.p("pchComponentName", "")
    )

    uint32_t(
        "GetComponentRenderModelName",
        """
        Use this to get the render model name for the specified rendermode/component combination, to be passed to #LoadRenderModel_Async(). If the component
        name is out of range, this function will return 0. Otherwise, it will return the size of the buffer required for the name.
        """,

        charASCII.const.p("pchRenderModelName", ""),
        charASCII.const.p("pchComponentName", ""),
        Return(RESULT, includesNT = true)..nullable..charASCII.p("pchComponentRenderModelName", ""),
        AutoSize("pchComponentRenderModelName")..uint32_t("unComponentRenderModelNameLen", "")
    )

    bool(
        "GetComponentStateForDevicePath",
        "",

        charASCII.const.p("pchRenderModelName", ""),
        charASCII.const.p("pchComponentName", ""),
        VRInputValueHandle_t("devicePath", ""),
        RenderModel_ControllerMode_State_t.const.p("pState", ""),
        RenderModel_ComponentState_t.p("pComponentState", ""),

        returnDoc =
        """
        if the {@code pchRenderModelName} or {@code pchComponentName} is invalid, this will return false (and transforms will be set to identity). Otherwise,
        return true Note: For dynamic objects, visibility may be dynamic. (I.e., true/false will be returned based on controller state and controller mode
        state).
        """
    )

    bool(
        "GetComponentState",
        """
        This version of {@code GetComponentState} takes a controller state block instead of an action origin. This function is deprecated. You should use the
        new input system and #GetComponentStateForDevicePath() instead.
        """,

        charASCII.const.p("pchRenderModelName", ""),
        charASCII.const.p("pchComponentName", ""),
        VRControllerState_t.const.p("pControllerState", ""),
        RenderModel_ControllerMode_State_t.const.p("pState", ""),
        RenderModel_ComponentState_t.p("pComponentState", "")
    )

    bool(
        "RenderModelHasComponent",
        "Returns true if the render model has a component with the specified name.",

        charASCII.const.p("pchRenderModelName", ""),
        charASCII.const.p("pchComponentName", "")
    )

    uint32_t(
        "GetRenderModelThumbnailURL",
        "Returns the URL of the thumbnail image for this rendermodel.",

        charASCII.const.p("pchRenderModelName", ""),
        Return(RESULT, includesNT = true)..nullable..charASCII.p("pchThumbnailURL", ""),
        AutoSize("pchThumbnailURL")..uint32_t("unThumbnailURLLen", ""),
        Check(1)..EVRRenderModelError.p("peError", "")
    )

    uint32_t(
        "GetRenderModelOriginalPath",
        """
        Provides a render model path that will load the unskinned model if the model name provided has been replace by the user. If the model hasn't been
        replaced the path value will still be a valid path to load the model. Pass this to LoadRenderModel_Async, etc. to load the model.
        """,

        charASCII.const.p("pchRenderModelName", ""),
        Return(RESULT, includesNT = true)..nullable..charASCII.p("pchOriginalPath", ""),
        AutoSize("pchOriginalPath")..uint32_t("unOriginalPathLen", ""),
        Check(1)..EVRRenderModelError.p("peError", "")
    )

    charASCII.const.p(
        "GetRenderModelErrorNameFromEnum",
        "Returns a string for a render model error.",

        EVRRenderModelError("error", "")
    )
}