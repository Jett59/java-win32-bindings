// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$186 {

    static final FunctionDescriptor SetThreadExecutionState$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SetThreadExecutionState$MH = RuntimeHelper.downcallHandle(
        "SetThreadExecutionState",
        constants$186.SetThreadExecutionState$FUNC
    );
    static final FunctionDescriptor PowerCreateRequest$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PowerCreateRequest$MH = RuntimeHelper.downcallHandle(
        "PowerCreateRequest",
        constants$186.PowerCreateRequest$FUNC
    );
    static final FunctionDescriptor PowerSetRequest$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle PowerSetRequest$MH = RuntimeHelper.downcallHandle(
        "PowerSetRequest",
        constants$186.PowerSetRequest$FUNC
    );
    static final FunctionDescriptor PowerClearRequest$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle PowerClearRequest$MH = RuntimeHelper.downcallHandle(
        "PowerClearRequest",
        constants$186.PowerClearRequest$FUNC
    );
    static final FunctionDescriptor SetFileCompletionNotificationModes$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_CHAR$LAYOUT
    );
    static final MethodHandle SetFileCompletionNotificationModes$MH = RuntimeHelper.downcallHandle(
        "SetFileCompletionNotificationModes",
        constants$186.SetFileCompletionNotificationModes$FUNC
    );
    static final FunctionDescriptor Wow64GetThreadSelectorEntry$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle Wow64GetThreadSelectorEntry$MH = RuntimeHelper.downcallHandle(
        "Wow64GetThreadSelectorEntry",
        constants$186.Wow64GetThreadSelectorEntry$FUNC
    );
}


