// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$264 {

    static final FunctionDescriptor GetClipboardFormatNameA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle GetClipboardFormatNameA$MH = RuntimeHelper.downcallHandle(
        "GetClipboardFormatNameA",
        constants$264.GetClipboardFormatNameA$FUNC
    );
    static final FunctionDescriptor GetClipboardFormatNameW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle GetClipboardFormatNameW$MH = RuntimeHelper.downcallHandle(
        "GetClipboardFormatNameW",
        constants$264.GetClipboardFormatNameW$FUNC
    );
    static final FunctionDescriptor EmptyClipboard$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT);
    static final MethodHandle EmptyClipboard$MH = RuntimeHelper.downcallHandle(
        "EmptyClipboard",
        constants$264.EmptyClipboard$FUNC
    );
    static final FunctionDescriptor IsClipboardFormatAvailable$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle IsClipboardFormatAvailable$MH = RuntimeHelper.downcallHandle(
        "IsClipboardFormatAvailable",
        constants$264.IsClipboardFormatAvailable$FUNC
    );
    static final FunctionDescriptor GetPriorityClipboardFormat$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle GetPriorityClipboardFormat$MH = RuntimeHelper.downcallHandle(
        "GetPriorityClipboardFormat",
        constants$264.GetPriorityClipboardFormat$FUNC
    );
    static final FunctionDescriptor GetOpenClipboardWindow$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle GetOpenClipboardWindow$MH = RuntimeHelper.downcallHandle(
        "GetOpenClipboardWindow",
        constants$264.GetOpenClipboardWindow$FUNC
    );
}


