// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class tagGUITHREADINFO {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("cbSize"),
        Constants$root.C_LONG$LAYOUT.withName("flags"),
        Constants$root.C_POINTER$LAYOUT.withName("hwndActive"),
        Constants$root.C_POINTER$LAYOUT.withName("hwndFocus"),
        Constants$root.C_POINTER$LAYOUT.withName("hwndCapture"),
        Constants$root.C_POINTER$LAYOUT.withName("hwndMenuOwner"),
        Constants$root.C_POINTER$LAYOUT.withName("hwndMoveSize"),
        Constants$root.C_POINTER$LAYOUT.withName("hwndCaret"),
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("left"),
            Constants$root.C_LONG$LAYOUT.withName("top"),
            Constants$root.C_LONG$LAYOUT.withName("right"),
            Constants$root.C_LONG$LAYOUT.withName("bottom")
        ).withName("rcCaret")
    ).withName("tagGUITHREADINFO");
    public static MemoryLayout $LAYOUT() {
        return tagGUITHREADINFO.$struct$LAYOUT;
    }
    static final VarHandle cbSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cbSize"));
    public static VarHandle cbSize$VH() {
        return tagGUITHREADINFO.cbSize$VH;
    }
    public static int cbSize$get(MemorySegment seg) {
        return (int)tagGUITHREADINFO.cbSize$VH.get(seg);
    }
    public static void cbSize$set( MemorySegment seg, int x) {
        tagGUITHREADINFO.cbSize$VH.set(seg, x);
    }
    public static int cbSize$get(MemorySegment seg, long index) {
        return (int)tagGUITHREADINFO.cbSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbSize$set(MemorySegment seg, long index, int x) {
        tagGUITHREADINFO.cbSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle flags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("flags"));
    public static VarHandle flags$VH() {
        return tagGUITHREADINFO.flags$VH;
    }
    public static int flags$get(MemorySegment seg) {
        return (int)tagGUITHREADINFO.flags$VH.get(seg);
    }
    public static void flags$set( MemorySegment seg, int x) {
        tagGUITHREADINFO.flags$VH.set(seg, x);
    }
    public static int flags$get(MemorySegment seg, long index) {
        return (int)tagGUITHREADINFO.flags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void flags$set(MemorySegment seg, long index, int x) {
        tagGUITHREADINFO.flags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle hwndActive$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("hwndActive"));
    public static VarHandle hwndActive$VH() {
        return tagGUITHREADINFO.hwndActive$VH;
    }
    public static MemoryAddress hwndActive$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)tagGUITHREADINFO.hwndActive$VH.get(seg);
    }
    public static void hwndActive$set( MemorySegment seg, MemoryAddress x) {
        tagGUITHREADINFO.hwndActive$VH.set(seg, x);
    }
    public static MemoryAddress hwndActive$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)tagGUITHREADINFO.hwndActive$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hwndActive$set(MemorySegment seg, long index, MemoryAddress x) {
        tagGUITHREADINFO.hwndActive$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle hwndFocus$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("hwndFocus"));
    public static VarHandle hwndFocus$VH() {
        return tagGUITHREADINFO.hwndFocus$VH;
    }
    public static MemoryAddress hwndFocus$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)tagGUITHREADINFO.hwndFocus$VH.get(seg);
    }
    public static void hwndFocus$set( MemorySegment seg, MemoryAddress x) {
        tagGUITHREADINFO.hwndFocus$VH.set(seg, x);
    }
    public static MemoryAddress hwndFocus$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)tagGUITHREADINFO.hwndFocus$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hwndFocus$set(MemorySegment seg, long index, MemoryAddress x) {
        tagGUITHREADINFO.hwndFocus$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle hwndCapture$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("hwndCapture"));
    public static VarHandle hwndCapture$VH() {
        return tagGUITHREADINFO.hwndCapture$VH;
    }
    public static MemoryAddress hwndCapture$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)tagGUITHREADINFO.hwndCapture$VH.get(seg);
    }
    public static void hwndCapture$set( MemorySegment seg, MemoryAddress x) {
        tagGUITHREADINFO.hwndCapture$VH.set(seg, x);
    }
    public static MemoryAddress hwndCapture$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)tagGUITHREADINFO.hwndCapture$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hwndCapture$set(MemorySegment seg, long index, MemoryAddress x) {
        tagGUITHREADINFO.hwndCapture$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle hwndMenuOwner$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("hwndMenuOwner"));
    public static VarHandle hwndMenuOwner$VH() {
        return tagGUITHREADINFO.hwndMenuOwner$VH;
    }
    public static MemoryAddress hwndMenuOwner$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)tagGUITHREADINFO.hwndMenuOwner$VH.get(seg);
    }
    public static void hwndMenuOwner$set( MemorySegment seg, MemoryAddress x) {
        tagGUITHREADINFO.hwndMenuOwner$VH.set(seg, x);
    }
    public static MemoryAddress hwndMenuOwner$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)tagGUITHREADINFO.hwndMenuOwner$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hwndMenuOwner$set(MemorySegment seg, long index, MemoryAddress x) {
        tagGUITHREADINFO.hwndMenuOwner$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle hwndMoveSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("hwndMoveSize"));
    public static VarHandle hwndMoveSize$VH() {
        return tagGUITHREADINFO.hwndMoveSize$VH;
    }
    public static MemoryAddress hwndMoveSize$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)tagGUITHREADINFO.hwndMoveSize$VH.get(seg);
    }
    public static void hwndMoveSize$set( MemorySegment seg, MemoryAddress x) {
        tagGUITHREADINFO.hwndMoveSize$VH.set(seg, x);
    }
    public static MemoryAddress hwndMoveSize$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)tagGUITHREADINFO.hwndMoveSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hwndMoveSize$set(MemorySegment seg, long index, MemoryAddress x) {
        tagGUITHREADINFO.hwndMoveSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle hwndCaret$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("hwndCaret"));
    public static VarHandle hwndCaret$VH() {
        return tagGUITHREADINFO.hwndCaret$VH;
    }
    public static MemoryAddress hwndCaret$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)tagGUITHREADINFO.hwndCaret$VH.get(seg);
    }
    public static void hwndCaret$set( MemorySegment seg, MemoryAddress x) {
        tagGUITHREADINFO.hwndCaret$VH.set(seg, x);
    }
    public static MemoryAddress hwndCaret$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)tagGUITHREADINFO.hwndCaret$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hwndCaret$set(MemorySegment seg, long index, MemoryAddress x) {
        tagGUITHREADINFO.hwndCaret$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment rcCaret$slice(MemorySegment seg) {
        return seg.asSlice(56, 16);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


