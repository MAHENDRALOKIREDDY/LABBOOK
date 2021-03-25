package com.cg.hbm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.hbm.entity.RoomDetails;
import com.cg.hbm.service.IRoomDetailsService;

@RestController
@RequestMapping("/room")
public class IRoomDetailsController {
	@Autowired
	IRoomDetailsService iSer;
	
	@PostMapping("/create")
	public RoomDetails addRoomDetails(@RequestBody RoomDetails roomDetails) {
		return iSer.addRoomDetails(roomDetails);
	}
	@PutMapping("/update")
	public RoomDetails updateRoomDetails(@RequestBody RoomDetails roomDetails) {
		return iSer.updateRoomDetails(roomDetails);
	}
	@DeleteMapping("/remove")
	public RoomDetails removeRoomDetails(@RequestBody RoomDetails roomDetails) {
		return iSer.removeRoomDetails(roomDetails);
	}
	@GetMapping("/all")
	public List<RoomDetails> showAllRoomDetails(){
		return iSer.showAllRoomDetails();
	}
	@GetMapping("/{roomDetails_id}")
	public RoomDetails showRoomDetails(@PathVariable int roomDetails_id) {
		return iSer.showRoomDetails(roomDetails_id);
	}
	
}
