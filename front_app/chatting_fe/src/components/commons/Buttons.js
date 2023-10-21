import styled, {css} from 'styled-components'

export const StyleButton = styled.button`
  width: ${props => props.width || '300px'};
  height: 50px;
  background: ${props => props.bg || 'black'};
  border: 0;
  color: #fff;

  ${props => props.border && css`
    border: 10px solid blue;
    border-radius: 5px;
  `}

  &:hover {
    background: gray;
  }

  i { //i만 따로 스타일을 주고 싶을 경우 
    font-size: 2rem;
    color: orange;
  }
  `;//스타일 정의