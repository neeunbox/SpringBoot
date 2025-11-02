package kr.co.sinamu.gallery.block.service;

import kr.co.sinamu.gallery.block.entity.Block;
import kr.co.sinamu.gallery.block.repository.BlockRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BaseBlockService implements BlockService {

    final BlockRepository blockRepository;

    // 토큰 차단 데이터 삽입
    @Override
    public void add(String token) {
        blockRepository.save(new Block(token));
    }

    // 토큰 차단 데이터가 있는지 확인
    @Override
    public boolean has(String token) {
        return blockRepository.findByToken(token).isPresent();
    }
}
