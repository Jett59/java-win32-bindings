// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class tagMSGBOXPARAMSA {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("cbSize"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("hwndOwner"),
        Constants$root.C_POINTER$LAYOUT.withName("hInstance"),
        Constants$root.C_POINTER$LAYOUT.withName("lpszText"),
        Constants$root.C_POINTER$LAYOUT.withName("lpszCaption"),
        Constants$root.C_LONG$LAYOUT.withName("dwStyle"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("lpszIcon"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("dwContextHelpId"),
        Constants$root.C_POINTER$LAYOUT.withName("lpfnMsgBoxCallback"),
        Constants$root.C_LONG$LAYOUT.withName("dwLanguageId"),
        MemoryLayout.paddingLayout(32)
    ).withName("tagMSGBOXPARAMSA");
    public static MemoryLayout $LAYOUT() {
        return tagMSGBOXPARAMSA.$struct$LAYOUT;
    }
    static final VarHandle cbSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cbSize"));
    public static VarHandle cbSize$VH() {
        return tagMSGBOXPARAMSA.cbSize$VH;
    }
    public static int cbSize$get(MemorySegment seg) {
        return (int)tagMSGBOXPARAMSA.cbSize$VH.get(seg);
    }
    public static void cbSize$set( MemorySegment seg, int x) {
        tagMSGBOXPARAMSA.cbSize$VH.set(seg, x);
    }
    public static int cbSize$get(MemorySegment seg, long index) {
        return (int)tagMSGBOXPARAMSA.cbSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbSize$set(MemorySegment seg, long index, int x) {
        tagMSGBOXPARAMSA.cbSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle hwndOwner$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("hwndOwner"));
    public static VarHandle hwndOwner$VH() {
        return tagMSGBOXPARAMSA.hwndOwner$VH;
    }
    public static MemoryAddress hwndOwner$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)tagMSGBOXPARAMSA.hwndOwner$VH.get(seg);
    }
    public static void hwndOwner$set( MemorySegment seg, MemoryAddress x) {
        tagMSGBOXPARAMSA.hwndOwner$VH.set(seg, x);
    }
    public static MemoryAddress hwndOwner$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)tagMSGBOXPARAMSA.hwndOwner$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hwndOwner$set(MemorySegment seg, long index, MemoryAddress x) {
        tagMSGBOXPARAMSA.hwndOwner$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle hInstance$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("hInstance"));
    public static VarHandle hInstance$VH() {
        return tagMSGBOXPARAMSA.hInstance$VH;
    }
    public static MemoryAddress hInstance$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)tagMSGBOXPARAMSA.hInstance$VH.get(seg);
    }
    public static void hInstance$set( MemorySegment seg, MemoryAddress x) {
        tagMSGBOXPARAMSA.hInstance$VH.set(seg, x);
    }
    public static MemoryAddress hInstance$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)tagMSGBOXPARAMSA.hInstance$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hInstance$set(MemorySegment seg, long index, MemoryAddress x) {
        tagMSGBOXPARAMSA.hInstance$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lpszText$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lpszText"));
    public static VarHandle lpszText$VH() {
        return tagMSGBOXPARAMSA.lpszText$VH;
    }
    public static MemoryAddress lpszText$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)tagMSGBOXPARAMSA.lpszText$VH.get(seg);
    }
    public static void lpszText$set( MemorySegment seg, MemoryAddress x) {
        tagMSGBOXPARAMSA.lpszText$VH.set(seg, x);
    }
    public static MemoryAddress lpszText$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)tagMSGBOXPARAMSA.lpszText$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpszText$set(MemorySegment seg, long index, MemoryAddress x) {
        tagMSGBOXPARAMSA.lpszText$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lpszCaption$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lpszCaption"));
    public static VarHandle lpszCaption$VH() {
        return tagMSGBOXPARAMSA.lpszCaption$VH;
    }
    public static MemoryAddress lpszCaption$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)tagMSGBOXPARAMSA.lpszCaption$VH.get(seg);
    }
    public static void lpszCaption$set( MemorySegment seg, MemoryAddress x) {
        tagMSGBOXPARAMSA.lpszCaption$VH.set(seg, x);
    }
    public static MemoryAddress lpszCaption$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)tagMSGBOXPARAMSA.lpszCaption$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpszCaption$set(MemorySegment seg, long index, MemoryAddress x) {
        tagMSGBOXPARAMSA.lpszCaption$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwStyle$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwStyle"));
    public static VarHandle dwStyle$VH() {
        return tagMSGBOXPARAMSA.dwStyle$VH;
    }
    public static int dwStyle$get(MemorySegment seg) {
        return (int)tagMSGBOXPARAMSA.dwStyle$VH.get(seg);
    }
    public static void dwStyle$set( MemorySegment seg, int x) {
        tagMSGBOXPARAMSA.dwStyle$VH.set(seg, x);
    }
    public static int dwStyle$get(MemorySegment seg, long index) {
        return (int)tagMSGBOXPARAMSA.dwStyle$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwStyle$set(MemorySegment seg, long index, int x) {
        tagMSGBOXPARAMSA.dwStyle$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lpszIcon$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lpszIcon"));
    public static VarHandle lpszIcon$VH() {
        return tagMSGBOXPARAMSA.lpszIcon$VH;
    }
    public static MemoryAddress lpszIcon$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)tagMSGBOXPARAMSA.lpszIcon$VH.get(seg);
    }
    public static void lpszIcon$set( MemorySegment seg, MemoryAddress x) {
        tagMSGBOXPARAMSA.lpszIcon$VH.set(seg, x);
    }
    public static MemoryAddress lpszIcon$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)tagMSGBOXPARAMSA.lpszIcon$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpszIcon$set(MemorySegment seg, long index, MemoryAddress x) {
        tagMSGBOXPARAMSA.lpszIcon$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwContextHelpId$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwContextHelpId"));
    public static VarHandle dwContextHelpId$VH() {
        return tagMSGBOXPARAMSA.dwContextHelpId$VH;
    }
    public static long dwContextHelpId$get(MemorySegment seg) {
        return (long)tagMSGBOXPARAMSA.dwContextHelpId$VH.get(seg);
    }
    public static void dwContextHelpId$set( MemorySegment seg, long x) {
        tagMSGBOXPARAMSA.dwContextHelpId$VH.set(seg, x);
    }
    public static long dwContextHelpId$get(MemorySegment seg, long index) {
        return (long)tagMSGBOXPARAMSA.dwContextHelpId$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwContextHelpId$set(MemorySegment seg, long index, long x) {
        tagMSGBOXPARAMSA.dwContextHelpId$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lpfnMsgBoxCallback$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lpfnMsgBoxCallback"));
    public static VarHandle lpfnMsgBoxCallback$VH() {
        return tagMSGBOXPARAMSA.lpfnMsgBoxCallback$VH;
    }
    public static MemoryAddress lpfnMsgBoxCallback$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)tagMSGBOXPARAMSA.lpfnMsgBoxCallback$VH.get(seg);
    }
    public static void lpfnMsgBoxCallback$set( MemorySegment seg, MemoryAddress x) {
        tagMSGBOXPARAMSA.lpfnMsgBoxCallback$VH.set(seg, x);
    }
    public static MemoryAddress lpfnMsgBoxCallback$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)tagMSGBOXPARAMSA.lpfnMsgBoxCallback$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpfnMsgBoxCallback$set(MemorySegment seg, long index, MemoryAddress x) {
        tagMSGBOXPARAMSA.lpfnMsgBoxCallback$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MSGBOXCALLBACK lpfnMsgBoxCallback (MemorySegment segment, MemorySession session) {
        return MSGBOXCALLBACK.ofAddress(lpfnMsgBoxCallback$get(segment), session);
    }
    static final VarHandle dwLanguageId$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwLanguageId"));
    public static VarHandle dwLanguageId$VH() {
        return tagMSGBOXPARAMSA.dwLanguageId$VH;
    }
    public static int dwLanguageId$get(MemorySegment seg) {
        return (int)tagMSGBOXPARAMSA.dwLanguageId$VH.get(seg);
    }
    public static void dwLanguageId$set( MemorySegment seg, int x) {
        tagMSGBOXPARAMSA.dwLanguageId$VH.set(seg, x);
    }
    public static int dwLanguageId$get(MemorySegment seg, long index) {
        return (int)tagMSGBOXPARAMSA.dwLanguageId$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwLanguageId$set(MemorySegment seg, long index, int x) {
        tagMSGBOXPARAMSA.dwLanguageId$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


