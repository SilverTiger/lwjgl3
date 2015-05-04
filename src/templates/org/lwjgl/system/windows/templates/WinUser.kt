/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.system.windows.templates

import org.lwjgl.generator.*
import org.lwjgl.system.windows.*

val WinUser = "WinUser".nativeClass(WINDOWS_PACKAGE) {
	nativeImport (
		"WindowsLWJGL.h"
	)

	documentation = "Native bindings to WinUser.h."

	IntConstant.block(
		"Window Styles",
		"WS_OVERLAPPED" _ 0x00000000,
		"WS_POPUP" _ 0x80000000.i,
		"WS_CHILD" _ 0x40000000,
		"WS_MINIMIZE" _ 0x20000000,
		"WS_VISIBLE" _ 0x10000000,
		"WS_DISABLED" _ 0x08000000,
		"WS_CLIPSIBLINGS" _ 0x04000000,
		"WS_CLIPCHILDREN" _ 0x02000000,
		"WS_MAXIMIZE" _ 0x01000000,
		"WS_CAPTION" _ 0x00C00000, /* WS_BORDER | WS_DLGFRAME  */
		"WS_BORDER" _ 0x00800000,
		"WS_DLGFRAME" _ 0x00400000,
		"WS_VSCROLL" _ 0x00200000,
		"WS_HSCROLL" _ 0x00100000,
		"WS_SYSMENU" _ 0x00080000,
		"WS_THICKFRAME" _ 0x00040000,
		"WS_GROUP" _ 0x00020000,
		"WS_TABSTOP" _ 0x00010000,

		"WS_MINIMIZEBOX" _ 0x00020000,
		"WS_MAXIMIZEBOX" _ 0x00010000,

		// Common Window Styles
		"WS_OVERLAPPEDWINDOW" expr "WS_OVERLAPPED | WS_CAPTION | WS_SYSMENU | WS_THICKFRAME | WS_MINIMIZEBOX | WS_MAXIMIZEBOX",
		"WS_POPUPWINDOW" expr "WS_POPUP | WS_BORDER | WS_SYSMENU",
		"WS_CHILDWINDOW" expr "WS_CHILD",

		"WS_TILED" expr "WS_OVERLAPPED",
		"WS_ICONIC" expr "WS_MINIMIZE",
		"WS_SIZEBOX" expr "WS_THICKFRAME",
		"WS_TILEDWINDOW" expr "WS_OVERLAPPEDWINDOW"
	)

	IntConstant.block(
		"Windows messages.",
		"WM_NULL" _ 0x0000,
		"WM_CREATE" _ 0x0001,
		"WM_DESTROY" _ 0x0002,
		"WM_MOVE" _ 0x0003,
		"WM_SIZE" _ 0x0005,
		"WM_ACTIVATE" _ 0x0006,
		"WM_SETFOCUS" _ 0x0007,
		"WM_KILLFOCUS" _ 0x0008,
		"WM_ENABLE" _ 0x000A,
		"WM_SETREDRAW" _ 0x000B,
		"WM_SETTEXT" _ 0x000C,
		"WM_GETTEXT" _ 0x000D,
		"WM_GETTEXTLENGTH" _ 0x000E,
		"WM_PAINT" _ 0x000F,
		"WM_CLOSE" _ 0x0010,
		"WM_QUERYENDSESSION" _ 0x0011,
		"WM_QUERYOPEN" _ 0x0013,
		"WM_ENDSESSION" _ 0x0016,
		"WM_QUIT" _ 0x0012,
		"WM_ERASEBKGND" _ 0x0014,
		"WM_SYSCOLORCHANGE" _ 0x0015,
		"WM_SHOWWINDOW" _ 0x0018,
		"WM_WININICHANGE" _ 0x001A,
		"WM_SETTINGCHANGE" expr "WM_WININICHANGE",
		"WM_DEVMODECHANGE" _ 0x001B,
		"WM_ACTIVATEAPP" _ 0x001C,
		"WM_FONTCHANGE" _ 0x001D,
		"WM_TIMECHANGE" _ 0x001E,
		"WM_CANCELMODE" _ 0x001F,
		"WM_SETCURSOR" _ 0x0020,
		"WM_MOUSEACTIVATE" _ 0x0021,
		"WM_CHILDACTIVATE" _ 0x0022,
		"WM_QUEUESYNC" _ 0x0023,
		"WM_GETMINMAXINFO" _ 0x0024,
		"WM_PAINTICON" _ 0x0026,
		"WM_ICONERASEBKGND" _ 0x0027,
		"WM_NEXTDLGCTL" _ 0x0028,
		"WM_SPOOLERSTATUS" _ 0x002A,
		"WM_DRAWITEM" _ 0x002B,
		"WM_MEASUREITEM" _ 0x002C,
		"WM_DELETEITEM" _ 0x002D,
		"WM_VKEYTOITEM" _ 0x002E,
		"WM_CHARTOITEM" _ 0x002F,
		"WM_SETFONT" _ 0x0030,
		"WM_GETFONT" _ 0x0031,
		"WM_SETHOTKEY" _ 0x0032,
		"WM_GETHOTKEY" _ 0x0033,
		"WM_QUERYDRAGICON" _ 0x0037,
		"WM_COMPAREITEM" _ 0x0039,
		"WM_GETOBJECT" _ 0x003D,
		"WM_COMPACTING" _ 0x0041,
		"WM_COMMNOTIFY" _ 0x0044,
		"WM_WINDOWPOSCHANGING" _ 0x0046,
		"WM_WINDOWPOSCHANGED" _ 0x0047,
		"WM_POWER" _ 0x0048,
		"WM_COPYDATA" _ 0x004A,
		"WM_CANCELJOURNAL" _ 0x004B,
		"WM_NOTIFY" _ 0x004E,
		"WM_INPUTLANGCHANGEREQUEST" _ 0x0050,
		"WM_INPUTLANGCHANGE" _ 0x0051,
		"WM_TCARD" _ 0x0052,
		"WM_HELP" _ 0x0053,
		"WM_USERCHANGED" _ 0x0054,
		"WM_NOTIFYFORMAT" _ 0x0055,
		"WM_CONTEXTMENU" _ 0x007B,
		"WM_STYLECHANGING" _ 0x007C,
		"WM_STYLECHANGED" _ 0x007D,
		"WM_DISPLAYCHANGE" _ 0x007E,
		"WM_GETICON" _ 0x007F,
		"WM_SETICON" _ 0x0080,
		"WM_NCCREATE" _ 0x0081,
		"WM_NCDESTROY" _ 0x0082,
		"WM_NCCALCSIZE" _ 0x0083,
		"WM_NCHITTEST" _ 0x0084,
		"WM_NCPAINT" _ 0x0085,
		"WM_NCACTIVATE" _ 0x0086,
		"WM_GETDLGCODE" _ 0x0087,
		"WM_SYNCPAINT" _ 0x0088,
		"WM_NCMOUSEMOVE" _ 0x00A0,
		"WM_NCLBUTTONDOWN" _ 0x00A1,
		"WM_NCLBUTTONUP" _ 0x00A2,
		"WM_NCLBUTTONDBLCLK" _ 0x00A3,
		"WM_NCRBUTTONDOWN" _ 0x00A4,
		"WM_NCRBUTTONUP" _ 0x00A5,
		"WM_NCRBUTTONDBLCLK" _ 0x00A6,
		"WM_NCMBUTTONDOWN" _ 0x00A7,
		"WM_NCMBUTTONUP" _ 0x00A8,
		"WM_NCMBUTTONDBLCLK" _ 0x00A9,
		"WM_NCXBUTTONDOWN" _ 0x00AB,
		"WM_NCXBUTTONUP" _ 0x00AC,
		"WM_NCXBUTTONDBLCLK" _ 0x00AD,

		// _WIN32_WINNT >= 0x0501
		"WM_INPUT_DEVICE_CHANGE" _ 0x00FE,
		"WM_INPUT" _ 0x00FF,

		"WM_KEYFIRST" _ 0x0100,
		"WM_KEYDOWN" _ 0x0100,
		"WM_KEYUP" _ 0x0101,
		"WM_CHAR" _ 0x0102,
		"WM_DEADCHAR" _ 0x0103,
		"WM_SYSKEYDOWN" _ 0x0104,
		"WM_SYSKEYUP" _ 0x0105,
		"WM_SYSCHAR" _ 0x0106,
		"WM_SYSDEADCHAR" _ 0x0107,

		// _WIN32_WINNT >= 0x0501
		"WM_UNICHAR" _ 0x0109,
		"UNICODE_NOCHAR" _ 0xFFFF,

		"WM_IME_STARTCOMPOSITION" _ 0x010D,
		"WM_IME_ENDCOMPOSITION" _ 0x010E,
		"WM_IME_COMPOSITION" _ 0x010F,
		"WM_IME_KEYLAST" _ 0x010F,
		"WM_INITDIALOG" _ 0x0110,
		"WM_COMMAND" _ 0x0111,
		"WM_SYSCOMMAND" _ 0x0112,
		"WM_TIMER" _ 0x0113,
		"WM_HSCROLL" _ 0x0114,
		"WM_VSCROLL" _ 0x0115,
		"WM_INITMENU" _ 0x0116,
		"WM_INITMENUPOPUP" _ 0x0117,

		// WINVER >= 0x0601
		"WM_GESTURE" _ 0x0119,
		"WM_GESTURENOTIFY" _ 0x011A,

		"WM_MENUSELECT" _ 0x011F,
		"WM_MENUCHAR" _ 0x0120,
		"WM_ENTERIDLE" _ 0x0121,
		"WM_MENURBUTTONUP" _ 0x0122,
		"WM_MENUDRAG" _ 0x0123,
		"WM_MENUGETOBJECT" _ 0x0124,
		"WM_UNINITMENUPOPUP" _ 0x0125,
		"WM_MENUCOMMAND" _ 0x0126,
		"WM_CHANGEUISTATE" _ 0x0127,
		"WM_UPDATEUISTATE" _ 0x0128,
		"WM_QUERYUISTATE" _ 0x0129,
		"WM_CTLCOLORMSGBOX" _ 0x0132,
		"WM_CTLCOLOREDIT" _ 0x0133,
		"WM_CTLCOLORLISTBOX" _ 0x0134,
		"WM_CTLCOLORBTN" _ 0x0135,
		"WM_CTLCOLORDLG" _ 0x0136,
		"WM_CTLCOLORSCROLLBAR" _ 0x0137,
		"WM_CTLCOLORSTATIC" _ 0x0138,
		"MN_GETHMENU" _ 0x01E1,
		"WM_MOUSEFIRST" _ 0x0200,
		"WM_MOUSEMOVE" _ 0x0200,
		"WM_LBUTTONDOWN" _ 0x0201,
		"WM_LBUTTONUP" _ 0x0202,
		"WM_LBUTTONDBLCLK" _ 0x0203,
		"WM_RBUTTONDOWN" _ 0x0204,
		"WM_RBUTTONUP" _ 0x0205,
		"WM_RBUTTONDBLCLK" _ 0x0206,
		"WM_MBUTTONDOWN" _ 0x0207,
		"WM_MBUTTONUP" _ 0x0208,
		"WM_MBUTTONDBLCLK" _ 0x0209,
		"WM_MOUSEWHEEL" _ 0x020A,
		"WM_XBUTTONDOWN" _ 0x020B,
		"WM_XBUTTONUP" _ 0x020C,
		"WM_XBUTTONDBLCLK" _ 0x020D,

		// _WIN32_WINNT >= 0x0600
		"WM_MOUSEHWHEEL" _ 0x020E,

		// TODO: Add support for multi-expressions
		/*
		#if (_WIN32_WINNT >= 0x0600)
		"WM_MOUSELAST" _ 0x020E,
		#elif (_WIN32_WINNT >= 0x0500)
		"WM_MOUSELAST" _ 0x020D,
		#elif (_WIN32_WINNT >= 0x0400) || (_WIN32_WINDOWS > 0x0400)
		"WM_MOUSELAST" _ 0x020A,
		#else
		"WM_MOUSELAST" _ 0x0209,
		#endif
		*/

		"WM_PARENTNOTIFY" _ 0x0210,
		"WM_ENTERMENULOOP" _ 0x0211,
		"WM_EXITMENULOOP" _ 0x0212,
		"WM_NEXTMENU" _ 0x0213,
		"WM_SIZING" _ 0x0214,
		"WM_CAPTURECHANGED" _ 0x0215,
		"WM_MOVING" _ 0x0216,
		"WM_POWERBROADCAST" _ 0x0218,
		"WM_DEVICECHANGE" _ 0x0219,
		"WM_MDICREATE" _ 0x0220,
		"WM_MDIDESTROY" _ 0x0221,
		"WM_MDIACTIVATE" _ 0x0222,
		"WM_MDIRESTORE" _ 0x0223,
		"WM_MDINEXT" _ 0x0224,
		"WM_MDIMAXIMIZE" _ 0x0225,
		"WM_MDITILE" _ 0x0226,
		"WM_MDICASCADE" _ 0x0227,
		"WM_MDIICONARRANGE" _ 0x0228,
		"WM_MDIGETACTIVE" _ 0x0229,
		"WM_MDISETMENU" _ 0x0230,
		"WM_ENTERSIZEMOVE" _ 0x0231,
		"WM_EXITSIZEMOVE" _ 0x0232,
		"WM_DROPFILES" _ 0x0233,
		"WM_MDIREFRESHMENU" _ 0x0234,

		// WINVER >= 0x0601
		"WM_TOUCH" _ 0x0240,

		"WM_IME_SETCONTEXT" _ 0x0281,
		"WM_IME_NOTIFY" _ 0x0282,
		"WM_IME_CONTROL" _ 0x0283,
		"WM_IME_COMPOSITIONFULL" _ 0x0284,
		"WM_IME_SELECT" _ 0x0285,
		"WM_IME_CHAR" _ 0x0286,
		"WM_IME_REQUEST" _ 0x0288,
		"WM_IME_KEYDOWN" _ 0x0290,
		"WM_IME_KEYUP" _ 0x0291,
		"WM_MOUSEHOVER" _ 0x02A1,
		"WM_MOUSELEAVE" _ 0x02A3,
		"WM_NCMOUSEHOVER" _ 0x02A0,
		"WM_NCMOUSELEAVE" _ 0x02A2,

		// _WIN32_WINNT >= 0x0501
		"WM_WTSSESSION_CHANGE" _ 0x02B1,
		"WM_TABLET_FIRST" _ 0x02c0,
		"WM_TABLET_LAST" _ 0x02df,

		"WM_CUT" _ 0x0300,
		"WM_COPY" _ 0x0301,
		"WM_PASTE" _ 0x0302,
		"WM_CLEAR" _ 0x0303,
		"WM_UNDO" _ 0x0304,
		"WM_RENDERFORMAT" _ 0x0305,
		"WM_RENDERALLFORMATS" _ 0x0306,
		"WM_DESTROYCLIPBOARD" _ 0x0307,
		"WM_DRAWCLIPBOARD" _ 0x0308,
		"WM_PAINTCLIPBOARD" _ 0x0309,
		"WM_VSCROLLCLIPBOARD" _ 0x030A,
		"WM_SIZECLIPBOARD" _ 0x030B,
		"WM_ASKCBFORMATNAME" _ 0x030C,
		"WM_CHANGECBCHAIN" _ 0x030D,
		"WM_HSCROLLCLIPBOARD" _ 0x030E,
		"WM_QUERYNEWPALETTE" _ 0x030F,
		"WM_PALETTEISCHANGING" _ 0x0310,
		"WM_PALETTECHANGED" _ 0x0311,
		"WM_HOTKEY" _ 0x0312,
		"WM_PRINT" _ 0x0317,
		"WM_PRINTCLIENT" _ 0x0318,
		"WM_APPCOMMAND" _ 0x0319,

		// _WIN32_WINNT >= 0x0501
		"WM_THEMECHANGED" _ 0x031A,
		"WM_CLIPBOARDUPDATE" _ 0x031D,

		// _WIN32_WINNT >= 0x0600
		"WM_DWMCOMPOSITIONCHANGED" _ 0x031E,
		"WM_DWMNCRENDERINGCHANGED" _ 0x031F,
		"WM_DWMCOLORIZATIONCOLORCHANGED" _ 0x0320,
		"WM_DWMWINDOWMAXIMIZEDCHANGE" _ 0x0321,
		"WM_DWMSENDICONICTHUMBNAIL" _ 0x0323,
		"WM_DWMSENDICONICLIVEPREVIEWBITMAP" _ 0x0326,
		"WM_GETTITLEBARINFOEX" _ 0x033F,

		"WM_HANDHELDFIRST" _ 0x0358,
		"WM_HANDHELDLAST" _ 0x035F,

		"WM_AFXFIRST" _ 0x0360,
		"WM_AFXLAST" _ 0x037F,
		"WM_PENWINFIRST" _ 0x0380,
		"WM_PENWINLAST" _ 0x038F,
		"WM_APP" _ 0x8000,

		"WM_USER" _ 0x0400
	)

	IntConstant.block(
		"WM_ACTIVATE message {@code wParam} values.",
		"WA_ACTIVE" _ 1,
		"WA_CLICKACTIVE" _ 2,
		"WA_INACTIVE" _ 0
	)

	IntConstant.block(
		"WM_SIZE message {@code wParam} values.",
		"SIZE_RESTORED" _ 0,
		"SIZE_MINIMIZED" _ 1,
		"SIZE_MAXIMIZED" _ 2,
		"SIZE_MAXSHOW" _ 3,
		"SIZE_MAXHIDE" _ 4
	)

	IntConstant.block(
		"WM_DEVICECHANGE message {@code wParam} params.",

		"DBT_APPYBEGIN" _ 0x0000,
		"DBT_APPYEND" _ 0x0001,
		"DBT_DEVNODES_CHANGED" _ 0x0007,
		"DBT_QUERYCHANGECONFIG" _ 0x0017,
		"DBT_CONFIGCHANGED" _ 0x0018,
		"DBT_CONFIGCHANGECANCELED" _ 0x0019,
		"DBT_MONITORCHANGE" _ 0x001B
	)

	IntConstant.block(
		"System menu command values.",
		"SC_SIZE" _ 0xF000,
		"SC_MOVE" _ 0xF010,
		"SC_MINIMIZE" _ 0xF020,
		"SC_MAXIMIZE" _ 0xF030,
		"SC_NEXTWINDOW" _ 0xF040,
		"SC_PREVWINDOW" _ 0xF050,
		"SC_CLOSE" _ 0xF060,
		"SC_VSCROLL" _ 0xF070,
		"SC_HSCROLL" _ 0xF080,
		"SC_MOUSEMENU" _ 0xF090,
		"SC_KEYMENU" _ 0xF100,
		"SC_ARRANGE" _ 0xF110,
		"SC_RESTORE" _ 0xF120,
		"SC_TASKLIST" _ 0xF130,
		"SC_SCREENSAVE" _ 0xF140,
		"SC_HOTKEY" _ 0xF150,
		"SC_DEFAULT" _ 0xF160,
		"SC_MONITORPOWER" _ 0xF170,
		"SC_CONTEXTHELP" _ 0xF180,
		"SC_SEPARATOR" _ 0xF00F
	)

	IntConstant.block(
		"#GetSystemMetrics() codes.",
		"SM_CXSCREEN" _ 0,
		"SM_CYSCREEN" _ 1,
		"SM_CXVSCROLL" _ 2,
		"SM_CYHSCROLL" _ 3,
		"SM_CYCAPTION" _ 4,
		"SM_CXBORDER" _ 5,
		"SM_CYBORDER" _ 6,
		"SM_CXDLGFRAME" _ 7,
		"SM_CYDLGFRAME" _ 8,
		"SM_CYVTHUMB" _ 9,
		"SM_CXHTHUMB" _ 10,
		"SM_CXICON" _ 11,
		"SM_CYICON" _ 12,
		"SM_CXCURSOR" _ 13,
		"SM_CYCURSOR" _ 14,
		"SM_CYMENU" _ 15,
		"SM_CXFULLSCREEN" _ 16,
		"SM_CYFULLSCREEN" _ 17,
		"SM_CYKANJIWINDOW" _ 18,
		"SM_MOUSEPRESENT" _ 19,
		"SM_CYVSCROLL" _ 20,
		"SM_CXHSCROLL" _ 21,
		"SM_DEBUG" _ 22,
		"SM_SWAPBUTTON" _ 23,
		"SM_RESERVED1" _ 24,
		"SM_RESERVED2" _ 25,
		"SM_RESERVED3" _ 26,
		"SM_RESERVED4" _ 27,
		"SM_CXMIN" _ 28,
		"SM_CYMIN" _ 29,
		"SM_CXSIZE" _ 30,
		"SM_CYSIZE" _ 31,
		"SM_CXFRAME" _ 32,
		"SM_CYFRAME" _ 33,
		"SM_CXMINTRACK" _ 34,
		"SM_CYMINTRACK" _ 35,
		"SM_CXDOUBLECLK" _ 36,
		"SM_CYDOUBLECLK" _ 37,
		"SM_CXICONSPACING" _ 38,
		"SM_CYICONSPACING" _ 39,
		"SM_MENUDROPALIGNMENT" _ 40,
		"SM_PENWINDOWS" _ 41,
		"SM_DBCSENABLED" _ 42,
		"SM_CMOUSEBUTTONS" _ 43,

		"SM_CXFIXEDFRAME" expr "SM_CXDLGFRAME",
		"SM_CYFIXEDFRAME" expr "SM_CYDLGFRAME",
		"SM_CXSIZEFRAME" expr "SM_CXFRAME",
		"SM_CYSIZEFRAME" expr "SM_CYFRAME",

		"SM_SECURE" _ 44,
		"SM_CXEDGE" _ 45,
		"SM_CYEDGE" _ 46,
		"SM_CXMINSPACING" _ 47,
		"SM_CYMINSPACING" _ 48,
		"SM_CXSMICON" _ 49,
		"SM_CYSMICON" _ 50,
		"SM_CYSMCAPTION" _ 51,
		"SM_CXSMSIZE" _ 52,
		"SM_CYSMSIZE" _ 53,
		"SM_CXMENUSIZE" _ 54,
		"SM_CYMENUSIZE" _ 55,
		"SM_ARRANGE" _ 56,
		"SM_CXMINIMIZED" _ 57,
		"SM_CYMINIMIZED" _ 58,
		"SM_CXMAXTRACK" _ 59,
		"SM_CYMAXTRACK" _ 60,
		"SM_CXMAXIMIZED" _ 61,
		"SM_CYMAXIMIZED" _ 62,
		"SM_NETWORK" _ 63,
		"SM_CLEANBOOT" _ 67,
		"SM_CXDRAG" _ 68,
		"SM_CYDRAG" _ 69,
		"SM_SHOWSOUNDS" _ 70,
		"SM_CXMENUCHECK" _ 71,
		"SM_CYMENUCHECK" _ 72,
		"SM_SLOWMACHINE" _ 73,
		"SM_MIDEASTENABLED" _ 74,

		"SM_MOUSEWHEELPRESENT" _ 75,
		"SM_XVIRTUALSCREEN" _ 76,
		"SM_YVIRTUALSCREEN" _ 77,
		"SM_CXVIRTUALSCREEN" _ 78,
		"SM_CYVIRTUALSCREEN" _ 79,
		"SM_CMONITORS" _ 80,
		"SM_SAMEDISPLAYFORMAT" _ 81,
		"SM_IMMENABLED" _ 82,

		"SM_REMOTESESSION" _ 0x1000,

		// _WIN32_WINNT >= 0x0501

		"SM_SHUTTINGDOWN" _ 0x2000,
		"SM_REMOTECONTROL" _ 0x2001,
		"SM_CARETBLINKINGENABLED" _ 0x2002,

		"SM_CXFOCUSBORDER" _ 83,
		"SM_CYFOCUSBORDER" _ 84,

		"SM_TABLETPC" _ 86,
		"SM_MEDIACENTER" _ 87,
		"SM_STARTER" _ 88,
		"SM_SERVERR2" _ 89,

		// _WIN32_WINNT >= 0x0600

		"SM_MOUSEHORIZONTALWHEELPRESENT" _ 91,
		"SM_CXPADDEDBORDER" _ 92,

		// WINVER >= 0x0601

		"SM_DIGITIZER" _ 94,
		"SM_MAXIMUMTOUCHES" _ 95
	)

	IntConstant.block(
		"Extended Window Styles",
		"WS_EX_DLGMODALFRAME" _ 0x00000001,
		"WS_EX_NOPARENTNOTIFY" _ 0x00000004,
		"WS_EX_TOPMOST" _ 0x00000008,
		"WS_EX_ACCEPTFILES" _ 0x00000010,
		"WS_EX_TRANSPARENT" _ 0x00000020,
		"WS_EX_MDICHILD" _ 0x00000040,
		"WS_EX_TOOLWINDOW" _ 0x00000080,
		"WS_EX_WINDOWEDGE" _ 0x00000100,
		"WS_EX_CLIENTEDGE" _ 0x00000200,
		"WS_EX_CONTEXTHELP" _ 0x00000400,

		"WS_EX_RIGHT" _ 0x00001000,
		"WS_EX_LEFT" _ 0x00000000,
		"WS_EX_RTLREADING" _ 0x00002000,
		"WS_EX_LTRREADING" _ 0x00000000,
		"WS_EX_LEFTSCROLLBAR" _ 0x00004000,
		"WS_EX_RIGHTSCROLLBAR" _ 0x00000000,

		"WS_EX_CONTROLPARENT" _ 0x00010000,
		"WS_EX_STATICEDGE" _ 0x00020000,
		"WS_EX_APPWINDOW" _ 0x00040000,

		"WS_EX_OVERLAPPEDWINDOW" expr "WS_EX_WINDOWEDGE | WS_EX_CLIENTEDGE",
		"WS_EX_PALETTEWINDOW" expr "WS_EX_WINDOWEDGE | WS_EX_TOOLWINDOW | WS_EX_TOPMOST",

		"WS_EX_LAYERED" _ 0x00080000,

		"WS_EX_NOINHERITLAYOUT" _ 0x00100000, // Disable inheritence of mirroring by children
		"WS_EX_LAYOUTRTL" _ 0x00400000, // Right to left mirroring

		"WS_EX_COMPOSITED" _ 0x02000000, // WIN32_WINNT >= 0x0501

		"WS_EX_NOACTIVATE" _ 0x08000000
	)

	IntConstant.block(
		"May be used in #CreateWindowEx() for the x, y, width, height parameters.",
		"CW_USEDEFAULT" _ 0x80000000.i
	)

	IntConstant.block(
		"Key state masks for mouse messages.",
		"MK_LBUTTON" _ 0x0001,
		"MK_RBUTTON" _ 0x0002,
		"MK_SHIFT" _ 0x0004,
		"MK_CONTROL" _ 0x0008,
		"MK_MBUTTON" _ 0x0010,
		"MK_XBUTTON1" _ 0x0020,
		"MK_XBUTTON2" _ 0x0040
	)

	IntConstant.block(
		"Mouse position codes.",
		"HTERROR" _ -2,
		"HTTRANSPARENT" _ -1,
		"HTNOWHERE" _ 0,
		"HTCLIENT" _ 1,
		"HTCAPTION" _ 2,
		"HTSYSMENU" _ 3,
		"HTGROWBOX" _ 4,
		"HTSIZE" expr "HTGROWBOX",
		"HTMENU" _ 5,
		"HTHSCROLL" _ 6,
		"HTVSCROLL" _ 7,
		"HTMINBUTTON" _ 8,
		"HTMAXBUTTON" _ 9,
		"HTLEFT" _ 10,
		"HTRIGHT" _ 11,
		"HTTOP" _ 12,
		"HTTOPLEFT" _ 13,
		"HTTOPRIGHT" _ 14,
		"HTBOTTOM" _ 15,
		"HTBOTTOMLEFT" _ 16,
		"HTBOTTOMRIGHT" _ 17,
		"HTBORDER" _ 18,
		"HTREDUCE" expr "HTMINBUTTON",
		"HTZOOM" expr "HTMAXBUTTON",
		"HTSIZEFIRST" expr "HTLEFT",
		"HTSIZELAST" expr "HTBOTTOMRIGHT",
		"HTOBJECT" _ 19,
		"HTCLOSE" _ 20,
		"HTHELP" _ 21
	)

	IntConstant.block(
		"Class styles",
		"CS_VREDRAW" _ 0x0001,
		"CS_HREDRAW" _ 0x0002,
		"CS_DBLCLKS" _ 0x0008,
		"CS_OWNDC" _ 0x0020,
		"CS_CLASSDC" _ 0x0040,
		"CS_PARENTDC" _ 0x0080,
		"CS_NOCLOSE" _ 0x0200,
		"CS_SAVEBITS" _ 0x0800,
		"CS_BYTEALIGNCLIENT" _ 0x1000,
		"CS_BYTEALIGNWINDOW" _ 0x2000,
		"CS_GLOBALCLASS" _ 0x4000,

		"CS_IME" _ 0x00010000,
		"CS_DROPSHADOW" _ 0x00020000 // _WIN32_WINNT >=" _ 0x0501,
	)

	val WindowLongOffsets = IntConstant.block(
		"Window field offsets for #GetWindowLongPtr().",
		"GWL_WNDPROC" _ -4,
		"GWL_HINSTANCE" _ -6,
		"GWL_HWNDPARENT" _ -8,
		"GWL_STYLE" _ -16,
		"GWL_EXSTYLE" _ -20,
		"GWL_USERDATA" _ -21,
		"GWL_ID" _ -12
	).javaDocLinks

	IntConstant.block(
		"#ShowWindow() commands.",
		"SW_HIDE" _ 0,
		"SW_SHOWNORMAL" _ 1,
		"SW_NORMAL" _ 1,
		"SW_SHOWMINIMIZED" _ 2,
		"SW_SHOWMAXIMIZED" _ 3,
		"SW_MAXIMIZE" _ 3,
		"SW_SHOWNOACTIVATE" _ 4,
		"SW_SHOW" _ 5,
		"SW_MINIMIZE" _ 6,
		"SW_SHOWMINNOACTIVE" _ 7,
		"SW_SHOWNA" _ 8,
		"SW_RESTORE" _ 9,
		"SW_SHOWDEFAULT" _ 10,
		"SW_FORCEMINIMIZE" _ 11,
		"SW_MAX" _ 11
	)

	LongConstant.block(
		"Virtual window handles used by the #SetWindowPos() insertAfter argument.",
		"HWND_TOP" _ 0L,
		"HWND_BOTTOM" _ 1L,
		"HWND_TOPMOST" _ -1L,
		"HWND_NOTOPMOST" _ -2L
	)

	IntConstant.block(
		"Window sizing and positiong flags used by the #SetWindowPos() flags argument.",
		"SWP_NOSIZE" _ 0x0001,
		"SWP_NOMOVE" _ 0x0002,
		"SWP_NOZORDER" _ 0x0004,
		"SWP_NOREDRAW" _ 0x0008,
		"SWP_NOACTIVATE" _ 0x0010,
		"SWP_FRAMECHANGED" _ 0x0020, // The frame changed: send WM_NCCALCSIZE
		"SWP_SHOWWINDOW" _ 0x0040,
		"SWP_HIDEWINDOW" _ 0x0080,
		"SWP_NOCOPYBITS" _ 0x0100,
		"SWP_NOOWNERZORDER" _ 0x0200, // Don't do owner Z ordering
		"SWP_NOSENDCHANGING" _ 0x0400, // Don't send WM_WINDOWPOSCHANGING

		"SWP_DRAWFRAME" expr "SWP_FRAMECHANGED",
		"SWP_NOREPOSITION" expr "SWP_NOOWNERZORDER",

		"SWP_DEFERERASE" _ 0x2000,
		"SWP_ASYNCWINDOWPOS" _ 0x4000
	)

	IntConstant.block(
		"Standard Icon IDs. Use with ##nLoadIcon(long, long).",
		"IDI_APPLICATION" _ 32512,
		"IDI_HAND" _ 32513,
		"IDI_QUESTION" _ 32514,
		"IDI_EXCLAMATION" _ 32515,
		"IDI_ASTERISK" _ 32516,
		"IDI_WINLOGO" _ 32517,
		"IDI_SHIELD" _ 32518, // WINVER >= 0x0600
		"IDI_WARNING" expr "IDI_EXCLAMATION",
		"IDI_ERROR" expr "IDI_HAND",
		"IDI_INFORMATION" expr "IDI_ASTERISK"
	)

	IntConstant.block(
		"Standard Cursor IDs. Use with ##nLoadCursor(long, long).",
		"IDC_ARROW" _ 32512,
		"IDC_IBEAM" _ 32513,
		"IDC_WAIT" _ 32514,
		"IDC_CROSS" _ 32515,
		"IDC_UPARROW" _ 32516,
		"IDC_SIZE" _ 32640,
		"IDC_ICON" _ 32641,
		"IDC_SIZENWSE" _ 32642,
		"IDC_SIZENESW" _ 32643,
		"IDC_SIZEWE" _ 32644,
		"IDC_SIZENS" _ 32645,
		"IDC_SIZEALL" _ 32646,
		"IDC_NO" _ 32648,
		"IDC_HAND" _ 32649,
		"IDC_APPSTARTING" _ 32650,
		"IDC_HELP" _ 32651
	)

	IntConstant.block(
		"Class field offsets for #GetClassLongPtr().",
		"GCL_MENUNAME" _ -8,
		"GCL_HBRBACKGROUND" _ -10,
		"GCL_HCURSOR" _ -12,
		"GCL_HICON" _ -14,
		"GCL_HMODULE" _ -16,
		"GCL_CBWNDEXTRA" _ -18,
		"GCL_CBCLSEXTRA" _ -20,
		"GCL_WNDPROC" _ -24,
		"GCL_STYLE" _ -26,
		"GCW_ATOM" _ -32,
		"GCL_HICONSM" _ -34
	)

	IntConstant.block(
		"Queue status flags for #GetQueueStatus() and #MsgWaitForMultipleObjects()",
		"QS_KEY" _ 0x0001,
		"QS_MOUSEMOVE" _ 0x0002,
		"QS_MOUSEBUTTON" _ 0x0004,
		"QS_POSTMESSAGE" _ 0x0008,
		"QS_TIMER" _ 0x0010,
		"QS_PAINT" _ 0x0020,
		"QS_SENDMESSAGE" _ 0x0040,
		"QS_HOTKEY" _ 0x0080,
		"QS_ALLPOSTMESSAGE" _ 0x0100,
		"QS_RAWINPUT" _ 0x0400, // _WIN32_WINNT >= 0x0501
		"QS_MOUSE" expr "QS_MOUSEMOVE | QS_MOUSEBUTTON",
		"QS_INPUT" expr "QS_MOUSE | QS_KEY", // TODO: Add | QS_RAWINPUT if _WIN32_WINNT >= 0x0501
		"QS_ALLEVENTS" expr "QS_INPUT | QS_POSTMESSAGE | QS_TIMER | QS_PAINT | QS_HOTKEY",
		"QS_ALLINPUT" expr "QS_INPUT | QS_POSTMESSAGE | QS_TIMER | QS_PAINT | QS_HOTKEY | QS_SENDMESSAGE"
	)

	IntConstant.block(
		"Remove message flags for #PeekMessage().",
		"PM_NOREMOVE" _ 0x0000,
		"PM_REMOVE" _ 0x0001,
		"PM_NOYIELD" _ 0x0002,
		"PM_QS_INPUT" expr "QS_INPUT << 16",
		"PM_QS_POSTMESSAGE" expr "(QS_POSTMESSAGE | QS_HOTKEY | QS_TIMER) << 16",
		"PM_QS_PAINT" expr "QS_PAINT << 16",
		"PM_QS_SENDMESSAGE" expr "QS_SENDMESSAGE << 16"
	)

	val EnumMode = IntConstant.block(
		"EnumDisplaySettings mode.",

		"ENUM_CURRENT_SETTINGS" expr "-1",
		"ENUM_REGISTRY_SETTINGS" expr "-2"
	).javaDocLinks

	IntConstant.block(
		"Flags for #ChangeDisplaySettings().",
		"CDS_UPDATEREGISTRY" _ 0x00000001,
		"CDS_TEST" _ 0x00000002,
		"CDS_FULLSCREEN" _ 0x00000004,
		"CDS_GLOBAL" _ 0x00000008,
		"CDS_SET_PRIMARY" _ 0x00000010,
		"CDS_VIDEOPARAMETERS" _ 0x00000020,

		"CDS_ENABLE_UNSAFE_MODES" _ 0x00000100, // WINVER >= 0x0600
		"CDS_DISABLE_UNSAFE_MODES" _ 0x00000200, // WINVER >= 0x0600

		"CDS_RESET" _ 0x40000000,
		"CDS_RESET_EX" _ 0x20000000,
		"CDS_NORESET" _ 0x10000000
	)

	IntConstant.block(
		"Return values for #ChangeDisplaySettings().",
		"DISP_CHANGE_SUCCESSFUL" _ 0,
		"DISP_CHANGE_RESTART" _ 1,
		"DISP_CHANGE_FAILED" _ -1,
		"DISP_CHANGE_BADMODE" _ -2,
		"DISP_CHANGE_NOTUPDATED" _ -3,
		"DISP_CHANGE_BADFLAGS" _ -4,
		"DISP_CHANGE_BADPARAM" _ -5,

		"DISP_CHANGE_BADDUALVIEW" _ -6 // _WIN32_WINNT >= 0x0501
	)

	IntConstant.block(
		"Device state flags.",
		"DISPLAY_DEVICE_ATTACHED_TO_DESKTOP" _ 0x00000001,
		"DISPLAY_DEVICE_MULTI_DRIVER" _ 0x00000002,
		"DISPLAY_DEVICE_PRIMARY_DEVICE" _ 0x00000004,
		"DISPLAY_DEVICE_MIRRORING_DRIVER" _ 0x00000008,
		"DISPLAY_DEVICE_VGA_COMPATIBLE" _ 0x00000010,
		"DISPLAY_DEVICE_REMOVABLE" _ 0x00000020,
		"DISPLAY_DEVICE_MODESPRUNED" _ 0x08000000,
		"DISPLAY_DEVICE_REMOTE" _ 0x04000000,
		"DISPLAY_DEVICE_DISCONNECT" _ 0x02000000,
		"DISPLAY_DEVICE_TS_COMPATIBLE" _ 0x00200000,
		"DISPLAY_DEVICE_UNSAFE_MODES_ON" _ 0x00080000, // _WIN32_WINNT >= _WIN32_WINNT_LONGHORN

		/* Child device state */
		"DISPLAY_DEVICE_ACTIVE" _ 0x00000001,
		"DISPLAY_DEVICE_ATTACHED" _ 0x00000002
	)

	IntConstant.block(
		"Flags for #EnumDisplaySettingsEx().",
		"EDS_RAWMODE" _ 0x00000002,
		"EDS_ROTATEDMODE" _ 0x00000004
	)

	IntConstant.block(
		"#SystemParametersInfo() parameters.",

		"SPI_GETBEEP" _ 0x0001,
		"SPI_SETBEEP" _ 0x0002,
		"SPI_GETMOUSE" _ 0x0003,
		"SPI_SETMOUSE" _ 0x0004,
		"SPI_GETBORDER" _ 0x0005,
		"SPI_SETBORDER" _ 0x0006,
		"SPI_GETKEYBOARDSPEED" _ 0x000A,
		"SPI_SETKEYBOARDSPEED" _ 0x000B,
		"SPI_LANGDRIVER" _ 0x000C,
		"SPI_ICONHORIZONTALSPACING" _ 0x000D,
		"SPI_GETSCREENSAVETIMEOUT" _ 0x000E,
		"SPI_SETSCREENSAVETIMEOUT" _ 0x000F,
		"SPI_GETSCREENSAVEACTIVE" _ 0x0010,
		"SPI_SETSCREENSAVEACTIVE" _ 0x0011,
		"SPI_GETGRIDGRANULARITY" _ 0x0012,
		"SPI_SETGRIDGRANULARITY" _ 0x0013,
		"SPI_SETDESKWALLPAPER" _ 0x0014,
		"SPI_SETDESKPATTERN" _ 0x0015,
		"SPI_GETKEYBOARDDELAY" _ 0x0016,
		"SPI_SETKEYBOARDDELAY" _ 0x0017,
		"SPI_ICONVERTICALSPACING" _ 0x0018,
		"SPI_GETICONTITLEWRAP" _ 0x0019,
		"SPI_SETICONTITLEWRAP" _ 0x001A,
		"SPI_GETMENUDROPALIGNMENT" _ 0x001B,
		"SPI_SETMENUDROPALIGNMENT" _ 0x001C,
		"SPI_SETDOUBLECLKWIDTH" _ 0x001D,
		"SPI_SETDOUBLECLKHEIGHT" _ 0x001E,
		"SPI_GETICONTITLELOGFONT" _ 0x001F,
		"SPI_SETDOUBLECLICKTIME" _ 0x0020,
		"SPI_SETMOUSEBUTTONSWAP" _ 0x0021,
		"SPI_SETICONTITLELOGFONT" _ 0x0022,
		"SPI_GETFASTTASKSWITCH" _ 0x0023,
		"SPI_SETFASTTASKSWITCH" _ 0x0024,
		"SPI_SETDRAGFULLWINDOWS" _ 0x0025,
		"SPI_GETDRAGFULLWINDOWS" _ 0x0026,
		"SPI_GETNONCLIENTMETRICS" _ 0x0029,
		"SPI_SETNONCLIENTMETRICS" _ 0x002A,
		"SPI_GETMINIMIZEDMETRICS" _ 0x002B,
		"SPI_SETMINIMIZEDMETRICS" _ 0x002C,
		"SPI_GETICONMETRICS" _ 0x002D,
		"SPI_SETICONMETRICS" _ 0x002E,
		"SPI_SETWORKAREA" _ 0x002F,
		"SPI_GETWORKAREA" _ 0x0030,
		"SPI_SETPENWINDOWS" _ 0x0031,
		"SPI_GETHIGHCONTRAST" _ 0x0042,
		"SPI_SETHIGHCONTRAST" _ 0x0043,
		"SPI_GETKEYBOARDPREF" _ 0x0044,
		"SPI_SETKEYBOARDPREF" _ 0x0045,
		"SPI_GETSCREENREADER" _ 0x0046,
		"SPI_SETSCREENREADER" _ 0x0047,
		"SPI_GETANIMATION" _ 0x0048,
		"SPI_SETANIMATION" _ 0x0049,
		"SPI_GETFONTSMOOTHING" _ 0x004A,
		"SPI_SETFONTSMOOTHING" _ 0x004B,
		"SPI_SETDRAGWIDTH" _ 0x004C,
		"SPI_SETDRAGHEIGHT" _ 0x004D,
		"SPI_SETHANDHELD" _ 0x004E,
		"SPI_GETLOWPOWERTIMEOUT" _ 0x004F,
		"SPI_GETPOWEROFFTIMEOUT" _ 0x0050,
		"SPI_SETLOWPOWERTIMEOUT" _ 0x0051,
		"SPI_SETPOWEROFFTIMEOUT" _ 0x0052,
		"SPI_GETLOWPOWERACTIVE" _ 0x0053,
		"SPI_GETPOWEROFFACTIVE" _ 0x0054,
		"SPI_SETLOWPOWERACTIVE" _ 0x0055,
		"SPI_SETPOWEROFFACTIVE" _ 0x0056,
		"SPI_SETCURSORS" _ 0x0057,
		"SPI_SETICONS" _ 0x0058,
		"SPI_GETDEFAULTINPUTLANG" _ 0x0059,
		"SPI_SETDEFAULTINPUTLANG" _ 0x005A,
		"SPI_SETLANGTOGGLE" _ 0x005B,
		"SPI_GETWINDOWSEXTENSION" _ 0x005C,
		"SPI_SETMOUSETRAILS" _ 0x005D,
		"SPI_GETMOUSETRAILS" _ 0x005E,
		"SPI_SETSCREENSAVERRUNNING" _ 0x0061,
		"SPI_SCREENSAVERRUNNING" expr "SPI_SETSCREENSAVERRUNNING",
		"SPI_GETFILTERKEYS" _ 0x0032,
		"SPI_SETFILTERKEYS" _ 0x0033,
		"SPI_GETTOGGLEKEYS" _ 0x0034,
		"SPI_SETTOGGLEKEYS" _ 0x0035,
		"SPI_GETMOUSEKEYS" _ 0x0036,
		"SPI_SETMOUSEKEYS" _ 0x0037,
		"SPI_GETSHOWSOUNDS" _ 0x0038,
		"SPI_SETSHOWSOUNDS" _ 0x0039,
		"SPI_GETSTICKYKEYS" _ 0x003A,
		"SPI_SETSTICKYKEYS" _ 0x003B,
		"SPI_GETACCESSTIMEOUT" _ 0x003C,
		"SPI_SETACCESSTIMEOUT" _ 0x003D,
		"SPI_GETSERIALKEYS" _ 0x003E,
		"SPI_SETSERIALKEYS" _ 0x003F,
		"SPI_GETSOUNDSENTRY" _ 0x0040,
		"SPI_SETSOUNDSENTRY" _ 0x0041,
		"SPI_GETSNAPTODEFBUTTON" _ 0x005F,
		"SPI_SETSNAPTODEFBUTTON" _ 0x0060,
		"SPI_GETMOUSEHOVERWIDTH" _ 0x0062,
		"SPI_SETMOUSEHOVERWIDTH" _ 0x0063,
		"SPI_GETMOUSEHOVERHEIGHT" _ 0x0064,
		"SPI_SETMOUSEHOVERHEIGHT" _ 0x0065,
		"SPI_GETMOUSEHOVERTIME" _ 0x0066,
		"SPI_SETMOUSEHOVERTIME" _ 0x0067,
		"SPI_GETWHEELSCROLLLINES" _ 0x0068,
		"SPI_SETWHEELSCROLLLINES" _ 0x0069,
		"SPI_GETMENUSHOWDELAY" _ 0x006A,
		"SPI_SETMENUSHOWDELAY" _ 0x006B,
		"SPI_GETWHEELSCROLLCHARS" _ 0x006C,
		"SPI_SETWHEELSCROLLCHARS" _ 0x006D,
		"SPI_GETSHOWIMEUI" _ 0x006E,
		"SPI_SETSHOWIMEUI" _ 0x006F,
		"SPI_GETMOUSESPEED" _ 0x0070,
		"SPI_SETMOUSESPEED" _ 0x0071,
		"SPI_GETSCREENSAVERRUNNING" _ 0x0072,
		"SPI_GETDESKWALLPAPER" _ 0x0073,
		"SPI_GETAUDIODESCRIPTION" _ 0x0074,
		"SPI_SETAUDIODESCRIPTION" _ 0x0075,
		"SPI_GETSCREENSAVESECURE" _ 0x0076,
		"SPI_SETSCREENSAVESECURE" _ 0x0077,
		"SPI_GETHUNGAPPTIMEOUT" _ 0x0078,
		"SPI_SETHUNGAPPTIMEOUT" _ 0x0079,
		"SPI_GETWAITTOKILLTIMEOUT" _ 0x007A,
		"SPI_SETWAITTOKILLTIMEOUT" _ 0x007B,
		"SPI_GETWAITTOKILLSERVICETIMEOUT" _ 0x007C,
		"SPI_SETWAITTOKILLSERVICETIMEOUT" _ 0x007D,
		"SPI_GETMOUSEDOCKTHRESHOLD" _ 0x007E,
		"SPI_SETMOUSEDOCKTHRESHOLD" _ 0x007F,
		"SPI_GETPENDOCKTHRESHOLD" _ 0x0080,
		"SPI_SETPENDOCKTHRESHOLD" _ 0x0081,
		"SPI_GETWINARRANGING" _ 0x0082,
		"SPI_SETWINARRANGING" _ 0x0083,
		"SPI_GETMOUSEDRAGOUTTHRESHOLD" _ 0x0084,
		"SPI_SETMOUSEDRAGOUTTHRESHOLD" _ 0x0085,
		"SPI_GETPENDRAGOUTTHRESHOLD" _ 0x0086,
		"SPI_SETPENDRAGOUTTHRESHOLD" _ 0x0087,
		"SPI_GETMOUSESIDEMOVETHRESHOLD" _ 0x0088,
		"SPI_SETMOUSESIDEMOVETHRESHOLD" _ 0x0089,
		"SPI_GETPENSIDEMOVETHRESHOLD" _ 0x008A,
		"SPI_SETPENSIDEMOVETHRESHOLD" _ 0x008B,
		"SPI_GETDRAGFROMMAXIMIZE" _ 0x008C,
		"SPI_SETDRAGFROMMAXIMIZE" _ 0x008D,
		"SPI_GETSNAPSIZING" _ 0x008E,
		"SPI_SETSNAPSIZING" _ 0x008F,
		"SPI_GETDOCKMOVING" _ 0x0090,
		"SPI_SETDOCKMOVING" _ 0x0091,
		"SPI_GETTOUCHPREDICTIONPARAMETERS" _ 0x009C,
		"SPI_SETTOUCHPREDICTIONPARAMETERS" _ 0x009D,
		"MAX_LOGICALDPIOVERRIDE" _ 2,
		"MIN_LOGICALDPIOVERRIDE" _ -2,
		"SPI_GETLOGICALDPIOVERRIDE" _ 0x009E,
		"SPI_SETLOGICALDPIOVERRIDE" _ 0x009F,
		"SPI_GETMOUSECORNERCLIPLENGTH" _ 0x00A0,
		"SPI_SETMOUSECORNERCLIPLENGTH" _ 0x00A1,
		"SPI_GETMENURECT" _ 0x00A2,
		"SPI_SETMENURECT" _ 0x00A3,
		"SPI_GETACTIVEWINDOWTRACKING" _ 0x1000,
		"SPI_SETACTIVEWINDOWTRACKING" _ 0x1001,
		"SPI_GETMENUANIMATION" _ 0x1002,
		"SPI_SETMENUANIMATION" _ 0x1003,
		"SPI_GETCOMBOBOXANIMATION" _ 0x1004,
		"SPI_SETCOMBOBOXANIMATION" _ 0x1005,
		"SPI_GETLISTBOXSMOOTHSCROLLING" _ 0x1006,
		"SPI_SETLISTBOXSMOOTHSCROLLING" _ 0x1007,
		"SPI_GETGRADIENTCAPTIONS" _ 0x1008,
		"SPI_SETGRADIENTCAPTIONS" _ 0x1009,
		"SPI_GETKEYBOARDCUES" _ 0x100A,
		"SPI_SETKEYBOARDCUES" _ 0x100B,
		"SPI_GETMENUUNDERLINES" expr "SPI_GETKEYBOARDCUES",
		"SPI_SETMENUUNDERLINES" expr "SPI_SETKEYBOARDCUES",
		"SPI_GETACTIVEWNDTRKZORDER" _ 0x100C,
		"SPI_SETACTIVEWNDTRKZORDER" _ 0x100D,
		"SPI_GETHOTTRACKING" _ 0x100E,
		"SPI_SETHOTTRACKING" _ 0x100F,
		"SPI_GETMENUFADE" _ 0x1012,
		"SPI_SETMENUFADE" _ 0x1013,
		"SPI_GETSELECTIONFADE" _ 0x1014,
		"SPI_SETSELECTIONFADE" _ 0x1015,
		"SPI_GETTOOLTIPANIMATION" _ 0x1016,
		"SPI_SETTOOLTIPANIMATION" _ 0x1017,
		"SPI_GETTOOLTIPFADE" _ 0x1018,
		"SPI_SETTOOLTIPFADE" _ 0x1019,
		"SPI_GETCURSORSHADOW" _ 0x101A,
		"SPI_SETCURSORSHADOW" _ 0x101B,
		"SPI_GETMOUSESONAR" _ 0x101C,
		"SPI_SETMOUSESONAR" _ 0x101D,
		"SPI_GETMOUSECLICKLOCK" _ 0x101E,
		"SPI_SETMOUSECLICKLOCK" _ 0x101F,
		"SPI_GETMOUSEVANISH" _ 0x1020,
		"SPI_SETMOUSEVANISH" _ 0x1021,
		"SPI_GETFLATMENU" _ 0x1022,
		"SPI_SETFLATMENU" _ 0x1023,
		"SPI_GETDROPSHADOW" _ 0x1024,
		"SPI_SETDROPSHADOW" _ 0x1025,
		"SPI_GETBLOCKSENDINPUTRESETS" _ 0x1026,
		"SPI_SETBLOCKSENDINPUTRESETS" _ 0x1027,
		"SPI_GETUIEFFECTS" _ 0x103E,
		"SPI_SETUIEFFECTS" _ 0x103F,
		"SPI_GETDISABLEOVERLAPPEDCONTENT" _ 0x1040,
		"SPI_SETDISABLEOVERLAPPEDCONTENT" _ 0x1041,
		"SPI_GETCLIENTAREAANIMATION" _ 0x1042,
		"SPI_SETCLIENTAREAANIMATION" _ 0x1043,
		"SPI_GETCLEARTYPE" _ 0x1048,
		"SPI_SETCLEARTYPE" _ 0x1049,
		"SPI_GETSPEECHRECOGNITION" _ 0x104A,
		"SPI_SETSPEECHRECOGNITION" _ 0x104B,
		"SPI_GETCARETBROWSING" _ 0x104C,
		"SPI_SETCARETBROWSING" _ 0x104D,
		"SPI_GETTHREADLOCALINPUTSETTINGS" _ 0x104E,
		"SPI_SETTHREADLOCALINPUTSETTINGS" _ 0x104F,
		"SPI_GETSYSTEMLANGUAGEBAR" _ 0x1050,
		"SPI_SETSYSTEMLANGUAGEBAR" _ 0x1051,
		"SPI_GETFOREGROUNDLOCKTIMEOUT" _ 0x2000,
		"SPI_SETFOREGROUNDLOCKTIMEOUT" _ 0x2001,
		"SPI_GETACTIVEWNDTRKTIMEOUT" _ 0x2002,
		"SPI_SETACTIVEWNDTRKTIMEOUT" _ 0x2003,
		"SPI_GETFOREGROUNDFLASHCOUNT" _ 0x2004,
		"SPI_SETFOREGROUNDFLASHCOUNT" _ 0x2005,
		"SPI_GETCARETWIDTH" _ 0x2006,
		"SPI_SETCARETWIDTH" _ 0x2007,
		"SPI_GETMOUSECLICKLOCKTIME" _ 0x2008,
		"SPI_SETMOUSECLICKLOCKTIME" _ 0x2009,
		"SPI_GETFONTSMOOTHINGTYPE" _ 0x200A,
		"SPI_SETFONTSMOOTHINGTYPE" _ 0x200B,
		"SPI_GETFONTSMOOTHINGCONTRAST" _ 0x200C,
		"SPI_SETFONTSMOOTHINGCONTRAST" _ 0x200D,
		"SPI_GETFOCUSBORDERWIDTH" _ 0x200E,
		"SPI_SETFOCUSBORDERWIDTH" _ 0x200F,
		"SPI_GETFOCUSBORDERHEIGHT" _ 0x2010,
		"SPI_SETFOCUSBORDERHEIGHT" _ 0x2011,
		"SPI_GETFONTSMOOTHINGORIENTATION" _ 0x2012,
		"SPI_SETFONTSMOOTHINGORIENTATION" _ 0x2013,
		"SPI_GETMINIMUMHITRADIUS" _ 0x2014,
		"SPI_SETMINIMUMHITRADIUS" _ 0x2015,
		"SPI_GETMESSAGEDURATION" _ 0x2016,
		"SPI_SETMESSAGEDURATION" _ 0x2017,
		"SPI_GETCONTACTVISUALIZATION" _ 0x2018,
		"SPI_SETCONTACTVISUALIZATION" _ 0x2019,
		"SPI_GETGESTUREVISUALIZATION" _ 0x201A,
		"SPI_SETGESTUREVISUALIZATION" _ 0x201B
	)

	IntConstant.block(
		"#SystemParametersInfo() flags.",

		"SPIF_UPDATEINIFILE" _ 0x0001,
		"SPIF_SENDWININICHANGE" _ 0x0002,
		"SPIF_SENDCHANGE" expr "SPIF_SENDWININICHANGE"
	)

	IntConstant.block(
		"Virtual Keys.",

		"VK_LBUTTON" _ 0x01,
		"VK_RBUTTON" _ 0x02,
		"VK_CANCEL" _ 0x03,
		"VK_MBUTTON" _ 0x04,
		"VK_XBUTTON1" _ 0x05,
		"VK_XBUTTON2" _ 0x06,
		"VK_BACK" _ 0x08,
		"VK_TAB" _ 0x09,
		"VK_CLEAR" _ 0x0C,
		"VK_RETURN" _ 0x0D,
		"VK_SHIFT" _ 0x10,
		"VK_CONTROL" _ 0x11,
		"VK_MENU" _ 0x12,
		"VK_PAUSE" _ 0x13,
		"VK_CAPITAL" _ 0x14,
		"VK_KANA" _ 0x15,
		"VK_HANGEUL" _ 0x15,
		"VK_HANGUL" _ 0x15,
		"VK_JUNJA" _ 0x17,
		"VK_FINAL" _ 0x18,
		"VK_HANJA" _ 0x19,
		"VK_KANJI" _ 0x19,
		"VK_ESCAPE" _ 0x1B,
		"VK_CONVERT" _ 0x1C,
		"VK_NONCONVERT" _ 0x1D,
		"VK_ACCEPT" _ 0x1E,
		"VK_MODECHANGE" _ 0x1F,
		"VK_SPACE" _ 0x20,
		"VK_PRIOR" _ 0x21,
		"VK_NEXT" _ 0x22,
		"VK_END" _ 0x23,
		"VK_HOME" _ 0x24,
		"VK_LEFT" _ 0x25,
		"VK_UP" _ 0x26,
		"VK_RIGHT" _ 0x27,
		"VK_DOWN" _ 0x28,
		"VK_SELECT" _ 0x29,
		"VK_PRINT" _ 0x2A,
		"VK_EXECUTE" _ 0x2B,
		"VK_SNAPSHOT" _ 0x2C,
		"VK_INSERT" _ 0x2D,
		"VK_DELETE" _ 0x2E,
		"VK_HELP" _ 0x2F,
		"VK_LWIN" _ 0x5B,
		"VK_RWIN" _ 0x5C,
		"VK_APPS" _ 0x5D,
		"VK_SLEEP" _ 0x5F,
		"VK_NUMPAD0" _ 0x60,
		"VK_NUMPAD1" _ 0x61,
		"VK_NUMPAD2" _ 0x62,
		"VK_NUMPAD3" _ 0x63,
		"VK_NUMPAD4" _ 0x64,
		"VK_NUMPAD5" _ 0x65,
		"VK_NUMPAD6" _ 0x66,
		"VK_NUMPAD7" _ 0x67,
		"VK_NUMPAD8" _ 0x68,
		"VK_NUMPAD9" _ 0x69,
		"VK_MULTIPLY" _ 0x6A,
		"VK_ADD" _ 0x6B,
		"VK_SEPARATOR" _ 0x6C,
		"VK_SUBTRACT" _ 0x6D,
		"VK_DECIMAL" _ 0x6E,
		"VK_DIVIDE" _ 0x6F,
		"VK_F1" _ 0x70,
		"VK_F2" _ 0x71,
		"VK_F3" _ 0x72,
		"VK_F4" _ 0x73,
		"VK_F5" _ 0x74,
		"VK_F6" _ 0x75,
		"VK_F7" _ 0x76,
		"VK_F8" _ 0x77,
		"VK_F9" _ 0x78,
		"VK_F10" _ 0x79,
		"VK_F11" _ 0x7A,
		"VK_F12" _ 0x7B,
		"VK_F13" _ 0x7C,
		"VK_F14" _ 0x7D,
		"VK_F15" _ 0x7E,
		"VK_F16" _ 0x7F,
		"VK_F17" _ 0x80,
		"VK_F18" _ 0x81,
		"VK_F19" _ 0x82,
		"VK_F20" _ 0x83,
		"VK_F21" _ 0x84,
		"VK_F22" _ 0x85,
		"VK_F23" _ 0x86,
		"VK_F24" _ 0x87,
		"VK_NUMLOCK" _ 0x90,
		"VK_SCROLL" _ 0x91,
		"VK_OEM_NEC_EQUAL" _ 0x92,
		"VK_OEM_FJ_JISHO" _ 0x92,
		"VK_OEM_FJ_MASSHOU" _ 0x93,
		"VK_OEM_FJ_TOUROKU" _ 0x94,
		"VK_OEM_FJ_LOYA" _ 0x95,
		"VK_OEM_FJ_ROYA" _ 0x96,
		"VK_LSHIFT" _ 0xA0,
		"VK_RSHIFT" _ 0xA1,
		"VK_LCONTROL" _ 0xA2,
		"VK_RCONTROL" _ 0xA3,
		"VK_LMENU" _ 0xA4,
		"VK_RMENU" _ 0xA5,
		"VK_BROWSER_BACK" _ 0xA6,
		"VK_BROWSER_FORWARD" _ 0xA7,
		"VK_BROWSER_REFRESH" _ 0xA8,
		"VK_BROWSER_STOP" _ 0xA9,
		"VK_BROWSER_SEARCH" _ 0xAA,
		"VK_BROWSER_FAVORITES" _ 0xAB,
		"VK_BROWSER_HOME" _ 0xAC,
		"VK_VOLUME_MUTE" _ 0xAD,
		"VK_VOLUME_DOWN" _ 0xAE,
		"VK_VOLUME_UP" _ 0xAF,
		"VK_MEDIA_NEXT_TRACK" _ 0xB0,
		"VK_MEDIA_PREV_TRACK" _ 0xB1,
		"VK_MEDIA_STOP" _ 0xB2,
		"VK_MEDIA_PLAY_PAUSE" _ 0xB3,
		"VK_LAUNCH_MAIL" _ 0xB4,
		"VK_LAUNCH_MEDIA_SELECT" _ 0xB5,
		"VK_LAUNCH_APP1" _ 0xB6,
		"VK_LAUNCH_APP2" _ 0xB7,
		"VK_OEM_1" _ 0xBA,
		"VK_OEM_PLUS" _ 0xBB,
		"VK_OEM_COMMA" _ 0xBC,
		"VK_OEM_MINUS" _ 0xBD,
		"VK_OEM_PERIOD" _ 0xBE,
		"VK_OEM_2" _ 0xBF,
		"VK_OEM_3" _ 0xC0,
		"VK_OEM_4" _ 0xDB,
		"VK_OEM_5" _ 0xDC,
		"VK_OEM_6" _ 0xDD,
		"VK_OEM_7" _ 0xDE,
		"VK_OEM_8" _ 0xDF,
		"VK_OEM_AX" _ 0xE1,
		"VK_OEM_102" _ 0xE2,
		"VK_ICO_HELP" _ 0xE3,
		"VK_ICO_00" _ 0xE4,
		"VK_PROCESSKEY" _ 0xE5,
		"VK_ICO_CLEAR" _ 0xE6,
		"VK_PACKET" _ 0xE7,
		"VK_OEM_RESET" _ 0xE9,
		"VK_OEM_JUMP" _ 0xEA,
		"VK_OEM_PA1" _ 0xEB,
		"VK_OEM_PA2" _ 0xEC,
		"VK_OEM_PA3" _ 0xED,
		"VK_OEM_WSCTRL" _ 0xEE,
		"VK_OEM_CUSEL" _ 0xEF,
		"VK_OEM_ATTN" _ 0xF0,
		"VK_OEM_FINISH" _ 0xF1,
		"VK_OEM_COPY" _ 0xF2,
		"VK_OEM_AUTO" _ 0xF3,
		"VK_OEM_ENLW" _ 0xF4,
		"VK_OEM_BACKTAB" _ 0xF5,
		"VK_ATTN" _ 0xF6,
		"VK_CRSEL" _ 0xF7,
		"VK_EXSEL" _ 0xF8,
		"VK_EREOF" _ 0xF9,
		"VK_PLAY" _ 0xFA,
		"VK_ZOOM" _ 0xFB,
		"VK_NONAME" _ 0xFC,
		"VK_PA1" _ 0xFD,
		"VK_OEM_CLEAR" _ 0xFE
	)

	IntConstant.block(
		"XButton values.",

		"XBUTTON1" _ 0x0001,
		"XBUTTON2" _ 0x0002
	)

	IntConstant.block(
		"Value for rolling one detent.",

		"WHEEL_DELTA" _ 120
	)

	IntConstant.block(
		"##TRACKMOUSEEVENT flags.",

		"TME_HOVER" _ 0x00000001,
		"TME_LEAVE" _ 0x00000002,
		"TME_NONCLIENT" _ 0x00000010,
		"TME_QUERY" _ 0x40000000,
		"TME_CANCEL" _ 0x80000000.i
	)

	IntConstant.block(
		"Predefined Clipboard formats.",

		"CF_TEXT" _ 1,
		"CF_BITMAP" _ 2,
		"CF_METAFILEPICT" _ 3,
		"CF_SYLK" _ 4,
		"CF_DIF" _ 5,
		"CF_TIFF" _ 6,
		"CF_OEMTEXT" _ 7,
		"CF_DIB" _ 8,
		"CF_PALETTE" _ 9,
		"CF_PENDATA" _ 10,
		"CF_RIFF" _ 11,
		"CF_WAVE" _ 12,
		"CF_UNICODETEXT" _ 13,
		"CF_ENHMETAFILE" _ 14,
		"CF_HDROP" _ 15,
		"CF_LOCALE" _ 16,
		"CF_DIBV5" _ 17,
		"CF_MAX" _ 18
	)

	// ------------------------------------------------------------------------------

	ATOM.func(
		"RegisterClassEx",
		"Registers a window class for subsequent use in calls to the #CreateWindowEx() function.",

		const _ WNDCLASSEX_p.IN(
			"wndClassEx",
			"a ##WNDCLASSEX structure. You must fill the structure with the appropriate class attributes before passing it to the function."
		)
	)

	BOOL.func(
		"UnregisterClass",
		"Unregisters a window class, freeing the memory required for the class.",

		LPCTSTR.IN(
			"className",
			"""
			a null-terminated string or a class atom. If {@code className} is a string, it specifies the window class name. This class name must have been
			registered by a previous call to the #RegisterClassEx() function. System classes, such as dialog box controls, cannot be unregistered. If this
			parameter is an atom, it must be a class atom created by a previous call to the #RegisterClassEx() function. The atom must be in the low-order
			word of {@code className}; the high-order word must be zero.
			"""
		),
		HINSTANCE.IN("instance", "a handle to the instance of the module that created the class")
	)

	BOOL.func(
		"GetClassInfoEx",
		"Retrieves information about a window class, including a handle to the small icon associated with the window class.",

		nullable _ HINSTANCE.IN(
			"instance",
			"""
			a handle to the instance of the application that created the class. To retrieve information about classes defined by the system (such as buttons or
			list boxes), set this parameter to $NULL.
			"""
		),
		LPCTSTR.IN(
			"className",
			"""
			the class name. The name must be that of a preregistered class or a class registered by a previous call to the #RegisterClassEx() function.
			Alternatively, this parameter can be a class atom created by a previous call to #RegisterClassEx(). The atom must be in the low-order word of
			{@code className}; the high-order word must be zero.
			"""
		),
		LPWNDCLASSEX.OUT("classEx", "a ##WNDCLASSEX structure that receives the information about the class.")
	)

	ULONG_PTR.func(
		"GetClassLongPtr",
		"Retrieves the specified value from the WNDCLASSEX structure associated with the specified window.",

		HWND.IN("window", "a handle to the window and, indirectly, the class to which the window belongs"),
		int.IN("index", "the value to be retrieved")
	)

	ULONG_PTR.func(
		"SetClassLongPtr",
		"""
		Replaces the specified value at the specified offset into the extra class memory or the WNDCLASSEX structure for the class to which the specified window
		belongs.
		""",

		HWND.IN("window", "a handle to the window and, indirectly, the class to which the window belongs"),
		int.IN("index", "the value to be replaced"),
		LONG_PTR.IN("newLong", "the replacement value")
	)

	HICON.func(
		"LoadIcon",
		"Loads the specified icon resource from the executable (.exe) file associated with an application instance.",

		nullable _ HINSTANCE.IN(
			"instance",
			"""
			a handle to an instance of the module whose executable file contains the icon to be loaded. This parameter must be $NULL when a standard icon is
			being loaded.
			"""
		),
		LPCTSTR.IN("iconName", "the name of the icon resource to be loaded")
	)

	HCURSOR.func(
		"LoadCursor",
		"Loads the specified cursor resource from the executable (.EXE) file associated with an application instance.",

		HINSTANCE.IN("instance", "a handle to an instance of the module whose executable file contains the cursor to be loaded."),
		LPCTSTR.IN("cursorName", "the name of the cursor resource to be loaded")
	)

	int.func(
		"GetSystemMetrics",
		"Retrieves the specified system metric or system configuration setting.",

		int.IN("index", "the system metric or configuration setting to be retrieved")
	)

	HWND.func(
		"CreateWindowEx",
		"Creates an overlapped, pop-up, or child window with an extended window style; otherwise, this function is identical to the CreateWindow function.",

		DWORD.IN("exStyle", "the extended window style of the window being created"),
		LPCTSTR.IN("className", "a null-terminated string or a class atom created by a previous call to the #RegisterClassEx() function."),
		LPCTSTR.IN("windowName", "the window name. If the window style specifies a title bar, the window title pointed to by {@code windowName} is displayed in the title bar."),
		DWORD.IN("style", "the style of the window being created"),
		int.IN("x", "the initial horizontal position of the window"),
		int.IN("y", "the initial vertical position of the window"),
		int.IN("width", "the width, in device units, of the window"),
		int.IN("height", "the height, in device units, of the window"),
		nullable _ HWND.IN("parent", "a handle to the parent or owner window of the window being created. To create a child window or an owned window, supply a valid window handle."),
		nullable _ HMENU.IN("menu", "a handle to a menu, or specifies a child-window identifier, depending on the window style"),
		HINSTANCE.IN("instance", "a handle to the instance of the module to be associated with the window"),
		nullable _ LPVOID.IN("param", "a value to be passed to the window through the ##CREATESTRUCT structure ({@code createParams} member) pointed to by the {@code lParam} param of the WM_CREATE message.")
	)

	BOOL.func(
		"DestroyWindow",
		"""
		Destroys the specified window. The function sends WM_DESTROY and WM_NCDESTROY messages to the window to deactivate it and remove the keyboard focus from
		it. The function also destroys the window's menu, flushes the thread message queue, destroys timers, removes clipboard ownership, and breaks the
		clipboard viewer chain (if the window is at the top of the viewer chain).

		If the specified window is a parent or owner window, DestroyWindow automatically destroys the associated child or owned windows when it destroys the
		parent or owner window. The function first destroys child or owned windows, and then it destroys the parent or owner window.
		""",

		HWND.IN("window", "a handle to the window to be destroyed")
	)

	BOOL.func(
		"ShowWindow",
		"Sets the specified window's show state.",

		HWND.IN("window", "a handle to the window"),
		int.IN("cmdShow", "controls how the window is to be shown")
	)

	BOOL.func(
		"UpdateWindow",
		"""
		Updates the client area of the specified window by sending a WM_PAINT message to the window if the window's update region is not empty. The function
		sends a WM_PAINT message directly to the window procedure of the specified window, bypassing the application queue. If the update region is empty, no
		message is sent.
		""",

		HWND.IN("window", "handle to the window to be updated")
	)

	BOOL.func(
		"SetWindowPos",
		"""
		Changes the size, position, and Z order of a child, pop-up, or top-level window. These windows are ordered according to their appearance on the screen.
		The topmost window receives the highest rank and is the first window in the Z order.
		""",

		HWND.IN("window", "a handle to the window"),
		nullable _ HWND.IN("insertAfter", "a handle to the window to precede the positioned window in the Z order"),
		int.IN("x", "the new position of the left side of the window, in client coordinates"),
		int.IN("y", "the new position of the top of the window, in client coordinates"),
		int.IN("width", "the new width of the window, in pixels"),
		int.IN("height", "the new height of the window, in pixels"),
		UINT.IN("flags", "the window sizing and positioning flags")
	)

	BOOL.func(
		"SetWindowText",
		"""
		Changes the text of the specified window's title bar (if it has one). If the specified window is a control, the text of the control is changed. However,
		{@code SetWindowText} cannot change the text of a control in another application.
		""",

		HWND.IN("window", "a handle to the window or control whose text is to be changed"),
		LPCTSTR.IN("string", "the new title or control text")
	)

	BOOL.func(
		"GetMessage",
		"""
		Retrieves a message from the calling thread's message queue. The function dispatches incoming sent messages until a posted message is available for
		retrieval. Unlike GetMessage, the #PeekMessage() function does not wait for a message to be posted before returning.
		""",

		LPMSG.OUT("msg", "an ##MSG structure that receives message information from the thread's message queue"),
		nullable _ HWND.IN("window", "a handle to the window whose messages are to be retrieved. The window must belong to the current thread."),
		UINT.IN("msgFilterMin", "the integer value of the lowest message value to be retrieved"),
		UINT.IN("msgFilterMax", "the integer value of the highest message value to be retrieved")
	)

	BOOL.func(
		"PeekMessage",
		"Dispatches incoming sent messages, checks the thread message queue for a posted message, and retrieves the message (if any exist).",

		LPMSG.OUT("msg", "an ##MSG structure that receives message information"),
		nullable _ HWND.IN("window", "a handle to the window whose messages are to be retrieved. The window must belong to the current thread."),
		UINT.IN("msgFilterMin", "the value of the first message in the range of messages to be examined"),
		UINT.IN("msgFilterMax", "the value of the last message in the range of messages to be examined"),
		UINT.IN("removeMsg", "specifies how messages are to be handled.", "#PM_NOREMOVE #PM_REMOVE #PM_NOYIELD")
	)

	BOOL.func(
		"TranslateMessage",
		"""
		Translates virtual-key messages into character messages. The character messages are posted to the calling thread's message queue, to be read the next
		time the thread calls the #GetMessage() or #PeekMessage() function.
		""",

		const _ MSG_p.IN(
			"msg",
			"""
			an ##MSG structure that contains message information retrieved from the calling thread's message queue by using the
			#GetMessage() or #PeekMessage() function.
			"""
		)
	)

	BOOL.func(
		"WaitMessage",
		"""
		Yields control to other threads when a thread has no other messages in its message queue. The WaitMessage function suspends the thread and does not
		return until a new message is placed in the thread's message queue.
		"""
	)

	LRESULT.func(
		"DispatchMessage",
		"Dispatches a message to a window procedure. It is typically used to dispatch a message retrieved by the #GetMessage() function.",

		const _ MSG_p.IN("msg", "a structure that contains the message")
	)

	DWORD.func(
		"GetQueueStatus",
		"Retrieves the type of messages found in the calling thread's message queue.",

		UINT.IN("flags", "the types of messages for which to check")
	)

	LONG.func(
		"GetMessageTime",
		"""
		Retrieves the message time for the last message retrieved by the GetMessage function. The time is a long integer that specifies the elapsed time, in
		milliseconds, from the time the system was started to the time the message was created (that is, placed in the thread's message queue).
		"""
	)

	LRESULT.func(
		"DefWindowProc",
		"""
		Calls the default window procedure to provide default processing for any window messages that an application does not process. This function ensures
		that every message is processed. DefWindowProc is called with the same parameters received by the window procedure.
		""",

		HWND.IN("window", "a handle to the window that received the message"),
		UINT.IN("msg", "the message"),
		WPARAM.IN("wParam", "additional message information. The content of this parameter depends on the value of the {@code msg} parameter."),
		LPARAM.IN("lParam", "additional message information. The content of this parameter depends on the value of the {@code msg} parameter.")
	)

	HDC.func(
		"GetDC",
		"""
		Retrieves a handle to a device context (DC) for the client area of a specified window or for the entire screen. You can use the returned handle in
		subsequent GDI functions to draw in the DC. The device context is an opaque data structure, whose values are used internally by GDI.
		""",

		nullable _ HWND.IN("window", "a handle to the window whose DC is to be retrieved. If this value is $NULL, {@code GetDC} retrieves the DC for the entire screen.")
	)

	int.func(
		"ReleaseDC",
		"""
		Releases a device context (DC), freeing it for use by other applications. The effect of the ReleaseDC function depends on the type of DC. It frees only
		common and window DCs. It has no effect on class or private DCs.
		""",

		nullable _ HWND.IN("window", "a handle to the window whose DC is to be released"),
		HDC.IN("hdc", "a handle to the DC to be released")
	)

	BOOL.func(
		"EnumDisplayDevices",
		"Obtains information about the display devices in the current session.",

		nullable _ LPCTSTR.IN(
			"device",
			"the device name. If $NULL, function returns information for the display adapter(s) on the machine, based on {@code devNum}."
		),
		DWORD.IN(
			"devNum",
			"""
			an index value that specifies the display device of interest. The operating system identifies each display device in the current session with an
			index value. The index values are consecutive integers, starting at 0. If the current session has three display devices, for example, they are
			specified by the index values 0, 1, and 2.
			"""
		),
		PDISPLAY_DEVICE.OUT(
			"displayDevice",
			"""
			a ##DISPLAY_DEVICE structure that receives information about the display device specified by {@code devNum}. Before calling
			{@code EnumDisplayDevices}, you must initialize the cb member of {@code DISPLAY_DEVICE} to the size, in bytes, of {@code DISPLAY_DEVICE}.
			"""
		),
		DWORD.IN("flags", "set this flag to EDD_GET_DEVICE_INTERFACE_NAME (0x00000001) to retrieve the device interface name for GUID_DEVINTERFACE_MONITOR, which is registered by the operating system on a per monitor basis")
	)

	BOOL.func(
		"EnumDisplaySettings",
		"""
		Retrieves information about one of the graphics modes for a display device. To retrieve information for all the graphics modes of a display device, make
		a series of calls to this function.
		""",

		nullable _ LPCTSTR.IN(
			"deviceName",
			"""
			a null-terminated string that specifies the display device about whose graphics mode the function will obtain information. This parameter is either
			$NULL or a DISPLAY_DEVICE.DeviceName returned from #EnumDisplayDevices(). A $NULL value specifies the current display device on the computer on
			which the calling thread is running.
			"""
		),
		DWORD.IN("modeNum", "the type of information to be retrieved. This value can be a graphics mode index or", EnumMode, LinkMode.SINGLE_CNT),
		DEVMODE_p.OUT("devMode", "a ##DEVMODE structure into which the function stores information about the specified graphics mode")
	)

	BOOL.func(
		"EnumDisplaySettingsEx",
		"""
		Retrieves information about one of the graphics modes for a display device. To retrieve information for all the graphics modes for a display device,
		make a series of calls to this function. This function differs from #EnumDisplaySettings() in that there is a {@code flags} parameter.
		""",

		LPCTSTR.IN("deviceName", "a null-terminated string that specifies the display device about which graphics mode the function will obtain information"),
		DWORD.IN("modeNum", "the type of information to be retrieved. This value can be a graphics mode index or", "#ENUM_CURRENT_SETTINGS #ENUM_REGISTRY_SETTINGS", LinkMode.SINGLE_CNT),
		DEVMODE_p.OUT("devMode", "a ##DEVMODE structure into which the function stores information about the specified graphics mode"),
		DWORD.IN("flags", "", "#EDS_RAWMODE #EDS_ROTATEDMODE")
	)

	LONG.func(
		"ChangeDisplaySettings",
		"Changes the settings of the default display device to the specified graphics mode.",

		nullable _ DEVMODE_p.IN(
			"devMode",
			"""
			a ##DEVMODE structure that describes the new graphics mode. If {@code devMode} is $NULL, all the values currently in the registry will be used
			for the display setting. Passing $NULL for the {@code devMode} parameter and 0 for the {@code flagS} parameter is the easiest way to return to the
			default mode after a dynamic mode change.
			"""
		),
		DWORD.IN("flags", "indicates how the graphics mode should be changed")
	)

	LONG.func(
		"ChangeDisplaySettingsEx",
		"Changes the settings of the specified display device to the specified graphics mode.",

		LPCTSTR.IN("deviceName", "a null-terminated string that specifies the display device whose graphics mode will change"),
		nullable _ DEVMODE_p.IN(
			"devMode",
			"""
			a ##DEVMODE structure that describes the new graphics mode. If {@code devMode} is $NULL, all the values currently in the registry will be used
			for the display setting. Passing $NULL for the {@code devMode} parameter and 0 for the {@code flagS} parameter is the easiest way to return to the
			default mode after a dynamic mode change.
			"""
		),
		nullable _ HWND.IN("window", "reserved; must be $NULL"),
		DWORD.IN("flags", "indicates how the graphics mode should be changed"),
		nullable _ LPVOID.IN(
			"param",
			"if {@code flags} is #CDS_VIDEOPARAMETERS, {@code param} is a pointer to a ##VIDEOPARAMETERS structure. Otherwise {@code param} must be $NULL."
		)
	)

	BOOL.func(
		"SystemParametersInfo",
		"Retrieves or sets the value of one of the system-wide parameters. This function can also update the user profile while setting a parameter.",

		UINT.IN("uiAction", "the system-wide parameter to be retrieved or set"),
		UINT.IN(
			"uiParam",
			"""
			a parameter whose usage and format depends on the system parameter being queried or set. If not otherwise indicated, you must specify zero for this
			parameter.
			"""
		),
		nullable _ PVOID.OUT(
			"pvParam",
			"""
			a parameter whose usage and format depends on the system parameter being queried or set. If not otherwise indicated, you must specify $NULL for this
			parameter.
			"""
		),
		UINT.IN(
			"fWinIni",
			"""
			if a system parameter is being set, specifies whether the user profile is to be updated, and if so, whether the #WM_SETTINGCHANGE message is
			to be broadcast to all top-level windows to notify them of the change.

			This parameter can be zero if you do not want to update the user profile or broadcast the #WM_SETTINGCHANGE message.
			"""
		)
	)

	BOOL.func(
		"AdjustWindowRectEx",
		"""
		Calculates the required size of the window rectangle, based on the desired size of the client rectangle. The window rectangle can then be passed to the
		#CreateWindowEx() function to create a window whose client area is the desired size.
		""",

		LPRECT.IN(
			"rect",
			"""
			a pointer to a ##RECT structure that contains the coordinates of the top-left and bottom-right corners of the desired client area. When the
			function returns, the structure contains the coordinates of the top-left and bottom-right corners of the window to accommodate the desired client
			area.
			"""
		),
		DWORD.IN("style", "the window style of the window whose required size is to be calculated. Note that you cannot specify the #WS_OVERLAPPED style."),
		BOOL.IN("menu", "indicates whether the window has a menu"),
		DWORD.IN("exStyle", "the extended window style of the window whose required size is to be calculated")
	)

	BOOL.func(
		"GetCursorPos",
		"Retrieves the position of the mouse cursor, in screen coordinates.",

		LPPOINT.OUT("point", "a pointer to a ##POINT structure that receives the screen coordinates of the cursor")
	)

	BOOL.func(
		"ScreenToClient",
		"Converts the screen coordinates of a specified point on the screen to client-area coordinates.",

		HWND.IN("hWnd", "a handle to the window whose client area will be used for the conversion"),
		LPPOINT.IN("point", "a pointer to a ##POINT structure that specifies the screen coordinates to be converted")
	)

	BOOL.func(
		"ClientToScreen",
		"Converts the client-area coordinates of a specified point to screen coordinates.",

		HWND.IN("hWnd", "a handle to the window whose client area will be used for the conversion"),
		LPPOINT.IN(
			"point",
			"""
			a pointer to a ##POINT structure that contains the client coordinates to be converted. The new screen coordinates are copied into this
			structure if the function succeeds.
			"""
		)
	)

	BOOL.func(
		"GetClientRect",
		"""
		Retrieves the coordinates of a window's client area. The client coordinates specify the upper-left and lower-right corners of the client area. Because
		client coordinates are relative to the upper-left corner of a window's client area, the coordinates of the upper-left corner are (0,0).
		""",

		HWND.IN("hWnd", "a handle to the window whose client coordinates are to be retrieved."),
		LPRECT.OUT(
			"rect",
			"""
			a pointer to a ##RECT structure that receives the client coordinates. The left and top members are zero. The right and bottom members contain
			the width and height of the window.
			"""
		)
	)

	HWND.func(
		"WindowFromPoint",
		"Retrieves a handle to the window that contains the specified point.",

		POINT.IN("point", "the point to be checked")
	)

	BOOL.func(
		"BringWindowToTop",
		"""
		Brings the specified window to the top of the Z order. If the window is a top-level window, it is activated. If the window is a child window, the
		top-level parent window associated with the child window is activated.
		""",

		HWND.IN("hWnd", "a handle to the window to bring to the top of the Z order")
	)

	BOOL.func(
		"SetForegroundWindow",
		"""
		Brings the thread that created the specified window into the foreground and activates the window. Keyboard input is directed to the window, and various
		visual cues are changed for the user. The system assigns a slightly higher priority to the thread that created the foreground window than it does to
		other threads.
		""",

		HWND.IN("hWnd", "a handle to the window that should be activated and brought to the foreground")
	)

	HWND.func(
		"SetFocus",
		"Sets the keyboard focus to the specified window. The window must be attached to the calling thread's message queue.",

		nullable _ HWND.IN("hWnd", "a handle to the window that will receive the keyboard input. If this parameter is $NULL, keystrokes are ignored."),

		returnDoc =
		"""
		the handle to the window that previously had the keyboard focus. If the {@code hWnd} parameter is invalid or the window is not attached to the calling
		thread's message queue, the return value is $NULL.
		"""
	)

	LONG_PTR.func(
		"SetWindowLongPtr",
		"Changes an attribute of the specified window. The function also sets a value at the specified offset in the extra window memory.",

		HWND.IN("hWnd", "a handle to the window and, indirectly, the class to which the window belongs"),
		int.IN(
			"index",
			"""
			the zero-based offset to the value to be set. Valid values are in the range zero through the number of bytes of extra window memory, minus the size
			of an integer. To set any other value, specify
			""",
			WindowLongOffsets, LinkMode.SINGLE_CNT
		),
		LONG_PTR.IN("newLong", "the replacement value"),

		returnDoc = "the previous value at the given {@code index}"
	)

	LONG_PTR.func(
		"GetWindowLongPtr",
		"Retrieves information about the specified window. The function also retrieves the value at a specified offset into the extra window memory.",

		HWND.IN("hWnd", "a handle to the window and, indirectly, the class to which the window belongs"),
		int.IN(
			"index",
			"""
			the zero-based offset to the value to be set. Valid values are in the range zero through the number of bytes of extra window memory, minus the size
			of an integer. To set any other value, specify
			""",
			WindowLongOffsets, LinkMode.SINGLE_CNT
		)
	)

	SHORT.func(
		"GetAsyncKeyState",
		"Determines whether a key is up or down at the time the function is called, and whether the key was pressed after a previous call to {@code GetAsyncKeyState}.",

		int.IN("key", "the virtual-key code")
	)

	BOOL.func(
		"SetCursorPos",
		"""
		Moves the cursor to the specified screen coordinates. If the new coordinates are not within the screen rectangle set by the most recent #ClipCursor()
		function call, the system automatically adjusts the coordinates so that the cursor stays within the rectangle.
		""",

		int.IN("X", "the new x-coordinate of the cursor, in screen coordinates."),
		int.IN("Y", "the new y-coordinate of the cursor, in screen coordinates.")
	)

	HWND.func(
		"SetCapture",
		"""
		Sets the mouse capture to the specified window belonging to the current thread. {@code SetCapture} captures mouse input either when the mouse is over
		the capturing window, or when the mouse button was pressed while the mouse was over the capturing window and the button is still down. Only one window
		at a time can capture the mouse.

		If the mouse cursor is over a window created by another thread, the system will direct mouse input to the specified window only if a mouse button is
		down.
		""",

		HWND.IN("hWnd", "a handle to the window in the current thread that is to capture the mouse"),

		returnDoc = "a handle to the window that had previously captured the mouse. If there is no such window, the return value is $NULL."
	)

	BOOL.func(
		"ReleaseCapture",
		"""
		Releases the mouse capture from a window in the current thread and restores normal mouse input processing. A window that has captured the mouse receives
		all mouse input, regardless of the position of the cursor, except when a mouse button is clicked while the cursor hot spot is in the window of another
		thread.
		"""
	)

	BOOL.func(
		"ClipCursor",
		"""
		"Confines the cursor to a rectangular area on the screen. If a subsequent cursor position (set by the {@code SetCursorPos} function or the mouse) lies
		outside the rectangle, the system automatically adjusts the position to keep the cursor inside the rectangular area.
		""",

		mods(const, nullable) _ RECT_p.IN(
			"rect",
			"""
			a pointer to the structure that contains the screen coordinates of the upper-left and lower-right corners of the confining rectangle. If this
			parameter is $NULL, the cursor is free to move anywhere on the screen.
			"""
		)
	)

	int.func(
		"ShowCursor",
		"""
		Displays or hides the cursor.

		This function sets an internal display counter that determines whether the cursor should be displayed. The cursor is displayed only if the display count
		is greater than or equal to 0. If a mouse is installed, the initial display count is 0. If no mouse is installed, the display count is –1.
		""",

		BOOL.IN(
			"show",
			"""
			If {@code show} is WinBase#TRUE, the display count is incremented by one. If {@code show} is WinBase#FALSE, the display count is
			decremented by one.
			"""
		)
	)

	HCURSOR.func(
		"SetCursor",
		"""
		Sets the cursor shape.

		The cursor is set only if the new cursor is different from the previous cursor; otherwise, the function returns immediately.

		The cursor is a shared resource. A window should set the cursor shape only when the cursor is in its client area or when the window is capturing mouse
		input. In systems without a mouse, the window should restore the previous cursor before the cursor leaves the client area or before it relinquishes
		control to another window.

		If your application must set the cursor while it is in a window, make sure the class cursor for the specified window's class is set to $NULL. If the
		class cursor is not NULL, the system restores the class cursor each time the mouse is moved.

		The cursor is not shown on the screen if the internal cursor display count is less than zero. This occurs if the application uses the #ShowCursor()
		function to hide the cursor more times than to show the cursor.
		""",

		nullable _ HCURSOR.IN(
			"hCursor",
			"""
			a handle to the cursor. The cursor must have been created by the #CreateCursor() function or loaded by the #LoadCursor() or
			#LoadImage() function. If this parameter is $NULL, the cursor is removed from the screen.
			"""
		),

		returnDoc = "the handle to the previous cursor, if there was one"
	)

	UINT.func(
		"MapVirtualKey",
		"Translates (maps) a virtual-key code into a scan code or character value, or translates a scan code into a virtual-key code.",

		UINT.IN("code", "the virtual key code or scan code for a key. How this value is interpreted depends on the value of the {@code mapType} parameter."),
		UINT.IN("mapType", "the translation to be performed. The value of this parameter depends on the value of the {@code code} parameter.")
	)

	BOOL.func(
		"TrackMouseEvent",
		"Posts messages when the mouse pointer leaves a window or hovers over a window for a specified amount of time.",

		LPTRACKMOUSEEVENT.IN("eventTrack", "a pointer to a {@code TRACKMOUSEEVENT} structure that contains tracking information.")
	)

	HWND.func(
		"GetForegroundWindow",
		"""
		Retrieves a handle to the foreground window (the window with which the user is currently working). The system assigns a slightly higher priority to the
		thread that creates the foreground window than it does to other threads.
		"""
	)

	BOOL.func(
		"OpenClipboard",
		"Opens the clipboard for examination and prevents other applications from modifying the clipboard content.",

		nullable _ HWND.IN(
			"hWndNewOwner",
			"a handle to the window to be associated with the open clipboard. If this parameter is $NULL, the open clipboard is associated with the current task."
		)
	)

	BOOL.func(
		"EmptyClipboard",
		"""
		Empties the clipboard and frees handles to data in the clipboard. The function then assigns ownership of the clipboard to the window that currently has
		the clipboard open.
		"""
	)

	HANDLE.func(
		"SetClipboardData",
		"""
		Places data on the clipboard in a specified clipboard format. The window must be the current clipboard owner, and the application must have called the
		#OpenClipboard() function. (When responding to the #WM_RENDERFORMAT and #WM_RENDERALLFORMATS messages, the clipboard owner must
		not call #OpenClipboard() before calling #SetClipboardData().)
		""",

		UINT.IN("format", "the clipboard format. This parameter can be a registered format or any of the standard clipboard formats."),
		HANDLE.IN(
			"hMem",
			"""
			a handle to the data in the specified format. This parameter can be $NULL, indicating that the window provides data in the specified clipboard
			format (renders the format) upon request. If a window delays rendering, it must process the #WM_RENDERFORMAT and #WM_RENDERALLFORMATS
			messages.

			If {@code SetClipboardData} succeeds, the system owns the object identified by the {@code hMem} parameter. The application may not write to or free
			the data once ownership has been transferred to the system, but it can lock and read from the data until the #CloseClipboard() function is
			called. (The memory must be unlocked before the #Clipboard() is closed.) If the {@code hMem} parameter identifies a memory object, the object
			must have been allocated using the function with the #GMEM_MOVEABLE flag.
			"""
		),

		returnDoc = "the handle to the data if the function succeeds. If the function fails, the return value is $NULL."
	)

	BOOL.func(
		"IsClipboardFormatAvailable",
		"Determines whether the clipboard contains data in the specified format.",

		UINT.IN("format", "a standard or registered clipboard format")
	)

	HANDLE.func(
		"GetClipboardData",
		"Retrieves data from the clipboard in a specified format. The clipboard must have been opened previously.",

		UINT.IN("format", "a clipboard format"),

		returnDoc = "the handle to a clipboard object in the specified format if the function succeeds. If the function fails, the return value is $NULL."
	)

	BOOL.func("CloseClipboard", "Closes the clipboard.")

}